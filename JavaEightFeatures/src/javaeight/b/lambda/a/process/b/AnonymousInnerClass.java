package javaeight.b.lambda.a.process.b;

@FunctionalInterface
interface A {
	void show();
}

public class AnonymousInnerClass {

	public static void main(final String[] args) {

		final A a = new A() {

			@Override
			public void show() {
				System.out.println("show a");
			}

		};

		a.show();
		
		final A a2 = new A() {

			@Override
			public void show() {
				System.out.println("show a2");
			}
			
		};
		
		a2.show();
	}
	
	// C:\Users\erhan\ew\OOP\bin\javaeight\lambda\process\b

}
