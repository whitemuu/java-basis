package me.nichijou.javac;

/**
 * Created by nichijou on 8/18/17.
 */
public class StaticBlock {
	public static void main(String[] args) {
		System.out.println(Demo1.i);
	}
}
class Demo1{
	// although <clinit> consists of class field assignment and static block,
	// when decompile the classfile, they are not in the same place
	static int i = 2;
	static {
		System.out.println("static block");
	}
}
