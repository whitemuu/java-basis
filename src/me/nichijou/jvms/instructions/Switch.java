package me.nichijou.jvms.instructions;

/**
 * Created by nichijou on 8/14/17.
 */
public class Switch {
	public static void main(String[] args) {
		System.out.println(chooseNear(1));
		switch ("a") {
			case "a":
				System.out.println("aaa");
			case "b":
				System.out.println("bbb");
			default:
				System.out.println("default");
		}
	}

	private static int chooseNear(int i) {
		switch (i) {
			case 0:
				return 0;
			case 1:
				return 1;
			case 2:
				return 2;
			default:
				return -1;
		}
	}

}
