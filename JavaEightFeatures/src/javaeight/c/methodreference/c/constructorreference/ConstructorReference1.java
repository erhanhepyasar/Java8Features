package javaeight.c.methodreference.c.constructorreference;

import java.util.function.Supplier;

public class ConstructorReference1 {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {

		// Creating objects using lambda
		final Supplier<Company> lambdaSupp = () -> new Company();
		System.out.println(lambdaSupp.get().getName());

		// Creating objects using constructor references
		final Supplier<Company> referenceSupp = Company::new;
		System.out.println(referenceSupp.get().getName());

	}
}

class Company {
	String name;

	public Company() {
		name = "My Company";
	}

	public Company(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
