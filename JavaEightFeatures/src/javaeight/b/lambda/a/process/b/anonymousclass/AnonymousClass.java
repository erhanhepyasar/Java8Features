package javaeight.b.lambda.a.process.b.anonymousclass;

@FunctionalInterface
interface A {
	void show();
}

public class AnonymousClass {

	public static void main(final String[] args) {

		final A a = new A() {

			@Override
			public void show() {
				System.out.println("show a");
			}

		};

		a.show();

		// NEXT STEP:
		// SonarLint- Major:
		// Anonymous inner classes containing only one method should become lambdas

	}

}
