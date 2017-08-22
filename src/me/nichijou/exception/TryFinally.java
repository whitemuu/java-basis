package me.nichijou.exception;

/**
 * Created by nichijou on 8/21/17.
 */
public class TryFinally {
	public static void main(String[] args) {
		int i = 1 / 0;
		try {
			int j = 1 / 0;
		} finally {
			// not executed
			System.out.println("finally");
		}
	}
}
