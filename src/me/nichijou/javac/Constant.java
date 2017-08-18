package me.nichijou.javac;

/**
 * Created by nichijou on 8/17/17.
 */
public class Constant {
	public static void main(String[] args) {
		//传播优化
		int a = 1;
		System.out.println(1);
		//常量折叠
		String b = "aaa"+"bbb";
		System.out.println(b);
		int c = 1+2;
		System.out.println(c);
		Integer d = 3+4;
		System.out.println(d);
	}
}
