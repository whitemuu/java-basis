package me.nichijou.deinjvm;

/**
 * Created by nichijou on 8/18/17.
 */
public class MethodOverloadResolution {
	static abstract class Human{}
	static class Man extends Human{}
	static class WoMan extends Human{}
	public void sayHello(Human human){
		System.out.println("hello, guy!");
	}
	public void sayHello(Man man){
		System.out.println("hello, gentle man!");
	}
	public void sayHello(WoMan woMan){
		System.out.println("hello, lady!");
	}

	public static void main(String[] args) {
		// p248 重载是根据静态类型(外观类型)来的，因为实际类型只有运行时才能确定,而javac编译器就已经把invokevirtual的参数✅确定了
		Man man = new Man();
		Human woMan = new WoMan();
		MethodOverloadResolution mor = new MethodOverloadResolution();
		mor.sayHello(man);
		mor.sayHello(woMan);
	}
}
