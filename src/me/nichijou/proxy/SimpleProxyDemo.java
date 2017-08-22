package me.nichijou.proxy;

/**
 * Created by nichijou on 8/20/17.
 */
public class SimpleProxyDemo {
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
	}

	static class SimpleProxy implements Interface {
		private Interface proxied;

		public SimpleProxy(Interface proxied) {
			this.proxied = proxied;
		}

		@Override
		public void doSomething() {
			System.out.println("SimpleProxy doSomething");
			proxied.doSomething();
		}

		@Override
		public void someThingElse(String arg) {
			System.out.println("SimpleProxy someThingElse " + arg);
			proxied.someThingElse(arg);
		}
	}

	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.someThingElse("bonobo");
	}

	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}
}/* Output
doSomething
someThingElsebonobo
SimpleProxy doSomething
doSomething
simpleproxy somethingelsebonobo
someThingElsebonobo
*/
