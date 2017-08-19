package me.nichijou.deinjvm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * Created by nichijou on 8/19/17.
 */
public class MethodHandleTest1 {
	class GrandFather{
		void thinking(){
			System.out.println("I'm gf");
		}
	}
	class Father extends GrandFather{
		@Override
		void thinking(){
			System.out.println("I'm ff");
		}
	}
	class Son extends Father{
		@Override
		void thinking() {
//			new GrandFather().thinking();
			try {
				MethodType methodType = MethodType.methodType(void.class);
				MethodHandle thinking = MethodHandles.lookup().findSpecial(GrandFather.class, "thinking", methodType, getClass());
				thinking.invoke(this);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// FIXME unexpected result 'ff'
		(new MethodHandleTest1().new Son()).thinking();
	}
}
