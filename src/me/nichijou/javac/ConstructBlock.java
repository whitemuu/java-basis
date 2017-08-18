package me.nichijou.javac;

/**
 * Created by nichijou on 8/18/17.
 */
public class ConstructBlock {
	public static void main(String[] args) {
		new Demo();
	}
}
class Demo{
	int i = 1;
	public Demo(){
		System.out.println("no arg constructor");
	}
	{
		System.out.println("block");
	}
	public Demo(int i){
		System.out.println("constructor with arg i which equals "+i);
	}
}
