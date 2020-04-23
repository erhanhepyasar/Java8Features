package oop;

class AB {
	public void show() {
		System.out.println("A");
	}
}

// 1st way
class ABC extends AB {
	@Override
	public void show() {
		System.out.println("ABC");
	}
}

// 3rd way
interface ABCD {
	void show();
}

public class AnonymousClass {

	public static void main(final String[] args) {

		// 1st way
		final ABC abc = new ABC();
		abc.show();

		// 2nd way
		final AB ab = new AB() {
			@Override
			public void show() {
				System.out.println("AB");
			}
		};

		ab.show();

		// 3rd way
//		final ABCD abcd = new ABCD() {
//			@Override
//			public void show() {
//				System.out.println("ABCD");				
//			}
//		};

		// 3rd way - Lambda expression
		final ABCD abcd = () -> System.out.println("ABCD");
		abcd.show();

	}

}
