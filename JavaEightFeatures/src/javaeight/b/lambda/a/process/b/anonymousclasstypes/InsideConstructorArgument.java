package javaeight.b.lambda.a.process.b.anonymousclasstypes;

public class InsideConstructorArgument {

	public static void main(final String[] args) {
		// Here we are using Anonymous Inner class
		// that define inside argument, here constructor argument
		final Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Child Thread");
			}
		});

		t.start();

		System.out.println("Main Thread");
	}

}
