package me.nichijou.jvms.instructions;

import com.sun.tools.javac.resources.javac;

/**
 * Created by nichijou on 8/23/17.
 */
public class Equals {
	public static void main(String[] args) {
		Integer i = 2;
		System.out.println(1==1);
		System.out.println(i==2); //out to be false intuitively, but javac did something
		System.out.println(2==i); //out to be false intuitively, but javac did something
		System.out.println(i.equals(2)); //true
		System.out.println("hell"=="hello");//false
		System.out.println("hello".equals("hello"));//true
		System.out.println(new Equals() == new Equals());//false
	}
}
