package me.nichijou.basis;

/**
 * Created by nichijou on 8/24/17.
 */
public class InstanceAccessStatic {
	static int i = 2;

	public static void main(String[] args) {
		InstanceAccessStatic instance = new InstanceAccessStatic();
		instance.i = 3;
		System.out.println(instance.i);
	}
}
