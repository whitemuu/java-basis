package me.nichijou.deinjvm;

/**
 * Created by nichijou on 8/17/17.
 */
class Field {
	// not initialized
	// todo 并没发现类 NotInitializing, 可能改名字了？
	public static final int i = 1;
}
class Field1{
	// initialized
	public static int i = 1;
}

public class FinalStaticField {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Field.i);
		System.out.println(Field1.i);
		Thread.sleep(60000);
		System.out.println("bye-------");
	}
}

