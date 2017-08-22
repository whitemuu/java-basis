package me.nichijou.access;

/**
 * Created by nichijou on 8/22/17.
 */
public class Protected {
	void method(){}
	static class ClassA {
		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		new ClassA().clone();
	}
}
