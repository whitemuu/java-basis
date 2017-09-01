package me.nichijou.system;

/**
 * Created by nichijou on 8/30/17.
 */
public class Directory {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		// /Users/nichijou/Documents/ideaProjects/jvm-basis
		// somehow wired

		System.out.println(Thread.currentThread().getContextClassLoader().getResource("").getPath());
	}
}
