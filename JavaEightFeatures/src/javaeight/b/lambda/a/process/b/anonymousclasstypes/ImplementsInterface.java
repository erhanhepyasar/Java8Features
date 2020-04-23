package javaeight.b.lambda.a.process.b.anonymousclasstypes;

public class ImplementsInterface {

	public static void main(final String[] args) {
		// Here we are using Anonymous Inner class
		// that implements a interface i.e. Here Runnable interface
		final Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Child Thread");
			}
		};
		final Thread t = new Thread(r);
		t.start();
		System.out.println("Main Thread");
	}

}
