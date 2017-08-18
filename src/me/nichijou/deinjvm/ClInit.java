package me.nichijou.deinjvm;

/**
 * Created by nichijou on 8/17/17.
 */
public class ClInit {
//	static {
//		//illegal forward reference
//		i = i;
//	}
//	static int i = 1;

	static class Parent {
		public static int A = 1;

		static {
			A = 2;
		}
	}

	static class Sub extends Parent {
		public static int B = A;
	}

	public static void main(String[] args) {
		// B = 2, 因为父类<clinit>先执行
		System.out.println(Sub.B);
	}
}
