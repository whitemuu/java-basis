package me.nichijou.javac;

/**
 * Created by nichijou on 8/18/17.
 */
public class InitCollect {

	static class Demo {
		{
			// distribute to every constructor(collected by <init>)
			System.out.println("block");
			i = 3;
		}

		// distribute to every constructor(collected by <init>)
		int i = 2;

		public Demo() {
			System.out.println("no arg constructor");
		}

		public Demo(int i) {
			System.out.println("constructor with arg i which equals " + i);
		}
	}

	public static void main(String[] args) {
		System.out.println((new Demo()).i);
	}
}
