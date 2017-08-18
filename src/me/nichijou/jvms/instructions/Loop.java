package me.nichijou.jvms.instructions;

/**
 * Created by nichijou on 8/13/17.
 */
public class Loop {
	int i;

	void spin() {
		for (int i = 0; i < 100; i++) {
			//loop body is empty
		}
	}

	void spin_b() {
		for (; i < 100; i++) {
			//loop body is empty
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		new Loop().spin_b();
	}
}
