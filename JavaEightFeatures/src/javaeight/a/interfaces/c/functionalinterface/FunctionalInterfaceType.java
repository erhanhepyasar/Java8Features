package javaeight.a.interfaces.c.functionalinterface;

// Single abstract method >>> @FunctionalInterface  >>> Lambda Expression

@FunctionalInterface 
interface IDemo {
	void show(); // single abstract method
}

interface IDemoNew {
	void fly();
	void walk();
}

public class FunctionalInterfaceType {

	public static void main(final String[] args) {
		IDemo demo = new IDemo() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			} // Interface

			
		};
		
		demo.show();
		
		IDemoNew demoNew = new IDemoNew() {
			
			@Override
			public void walk() {
				// TODO Auto-generated method stub 
				
			}
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				
			}
		};
		
		demoNew.walk();
		demoNew.fly();

	}

}
