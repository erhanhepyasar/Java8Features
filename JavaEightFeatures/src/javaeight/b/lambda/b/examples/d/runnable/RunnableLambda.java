package javaeight.b.lambda.b.examples.d.runnable;

public class RunnableLambda {

	@SuppressWarnings("unused")
	public static void main(final String[] args) {

//		Before Java 8 : Implementation of Runnable interface using anonymous inner class
		final Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable Implementation Using Anonymous Inner Class");
			}
		};

//		After Java 8 : Implementation of Runnable interface using lambda expressions
		final Runnable r2 = () -> System.out.println("Runnable Implementation Using Lambda Expressions");
	}

}
