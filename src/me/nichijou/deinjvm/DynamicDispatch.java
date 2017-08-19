package me.nichijou.deinjvm;

/**
 * Created by nichijou on 8/18/17.
 */
public class DynamicDispatch {
	static abstract class Human {
		protected abstract void sayHello();
	}

	static class Man extends Human {
		@Override
		protected void sayHello() {
			System.out.println("man");
		}
	}

	static class Woman extends Human {
		@Override
		protected void sayHello() {
			System.out.println("woman");
		}
	}

	public static void main(String[] args) {
		Human man = new Man();
		Woman woman = new Woman();
		man.sayHello();
		woman.sayHello();
		man = new Woman();
		man.sayHello();
	}
}
