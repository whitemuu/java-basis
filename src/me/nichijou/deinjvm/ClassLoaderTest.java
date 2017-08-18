package me.nichijou.deinjvm;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by nichijou on 8/17/17.
 */
public class ClassLoaderTest {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		ClassLoader classLoader = new ClassLoader() {
			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException {
				try {
					String fileName = name.substring(name.lastIndexOf(".")+1)+".class";
					// FIXME
					InputStream is = getClass().getResourceAsStream(fileName);
//					InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
					System.out.println(fileName);
					if (is == null){
						System.out.println("yes null");
						super.loadClass(name);
					}
					byte[] b = new byte[is.available()];
					is.read(b);
					return defineClass(name,b,0,b.length);
				} catch (IOException e) {
					throw new ClassNotFoundException(name);
				}
			}
		};
		Object obj = classLoader.loadClass("me.nichijou.deinjvm.ClassLoaderTest").newInstance();
		System.out.println(obj.getClass());
		// 双目运算符 instanceof
		System.out.println(obj instanceof me.nichijou.deinjvm.ClassLoaderTest);
	}
}
