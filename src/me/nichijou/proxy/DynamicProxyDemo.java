package me.nichijou.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by nichijou on 8/20/17.
 */
public class DynamicProxyDemo {
	interface Interface {
		void doSomething();

		void someThingElse(String arg);
	}

	static class RealObject implements Interface {
		@Override
		public void doSomething() {
			System.out.println("doSomething");
		}

		@Override
		public void someThingElse(String arg) {
			System.out.println("someThingElse " + arg);
		}
		public void ownMethod(){
			System.out.println("non override method");
		}
	}

	static class DynamicProxyHandler implements InvocationHandler {
		private Object proxied;

		public DynamicProxyHandler(Object proxied) {
			this.proxied = proxied;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("Proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
			if (args != null) {
				for (Object arg : args) {
					System.out.println("  " + arg);
				}
			}
			return method.invoke(proxied, args);
		}
	}

	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.someThingElse("bonobo");
	}

	public static void main(String[] args) throws InterruptedException {
		// 生成在了根目录，刚刚没见
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
		RealObject realObject = new RealObject();
		consumer(realObject);
		// 接口和InvocationHandler分别作为参数，而没有绑定在一起。达到自由组合目的，可以代理任意接口,
		// 相对于静态代理(手动编写代理类，见SimpleProxyDemo.java), 实现了原始类和接口未知情况下，确定代理行为
		Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(realObject));
		consumer(proxy);
		// ClassCastException
//		((RealObject)proxy).ownMethod();
	}
}
