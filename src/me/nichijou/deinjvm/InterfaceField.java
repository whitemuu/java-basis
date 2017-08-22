package me.nichijou.deinjvm;

/**
 * Created by nichijou on 8/21/17.
 */
public class InterfaceField {
	interface A {
		int i = 2;
	}

	static class B implements A {
		final static int j = 3;
	}

	public static void main(String[] args) {
		System.out.println(A.i+":"+B.i+":"+B.j);
	}
}
