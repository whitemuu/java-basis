package me.nichijou.string;

/**
 * Created by nichijou on 8/22/17.
 */
public class Field {
	static String str;
	static String s1 = "hello";
	static String s2 = "hello";
	static String s3 = new String("hello");

	static class A {
		static String s1 = "hello";
	}

	public static void main(String[] args) {
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==A.s1);
		System.out.println(s1==B.s1);
		System.out.println(s1==s3.intern());
		System.out.println(s2);
		System.out.println(s3);
	}
}
class B {
	static String s1 = "hello";
}
