package me.nichijou.deinjvm;

/**
 * Created by nichijou on 8/18/17.
 */
public class GC {
	// add vm option -verbose:gc while testing
	public static void main(String[] args) {
		byte[] placeholder = new byte[64 * 1024 * 1024];
		placeholder = null;
		System.gc();
	}
}
