package me.nichijou.classfileformat;

/**
 * Created by nichijou on 8/22/17.
 */
public class Methodref {
	//in constant pool as methodref
	void methodCalled() {
	}

	// not in constant pool as methodref
	void methodCaller() {
		methodCalled();
	}
}
