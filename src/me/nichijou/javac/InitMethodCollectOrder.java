package me.nichijou.javac;

/**
 * Created by nichijou on 8/22/17.
 */
public class InitMethodCollectOrder {
//	int i = 2;

	{
		// no illegal forward reference report like <clinit>
		// but the order does maters
		i = 3;
		System.out.println("construct block");
	}

	int i = 2;

	public InitMethodCollectOrder(int i) {
		if (this.i == 2)
			System.out.println("i==2"); //executed
		else if (this.i == 3)
			System.out.println("i==3");
		this.i = i;
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		InitMethodCollectOrder initMethodCollectOrder = new InitMethodCollectOrder(4);
		System.out.println(initMethodCollectOrder.i);
	}
}
