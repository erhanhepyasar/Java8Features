package javaeight.b.lambda.a.process.b.anonymousclass.anonymousclasstypes;

public class ExtendsClass {

	public static void main(final String[] args) {

		// Here we are using Anonymous Inner class
		// that extends a class i.e. Here a Thread class

		final Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("Child Thread");
			}
		};

		t.start();

		System.out.println("Main Thread");

	}

}
