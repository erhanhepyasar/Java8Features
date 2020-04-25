package javaeight.c.methodreference.b.instancemethodreference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javaeight.a.interfaces.c.functionalinterface.c.examples.instructor.Instructor;
import javaeight.a.interfaces.c.functionalinterface.c.examples.instructor.Instructors;

public class InstanceMethodReference {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {

		// println
		final Consumer<String> print1 = s -> System.out.println(s);
		final Consumer<String> print2 = System.out::println;
		print1.accept("Java");
		print2.accept("Developer");

		// toLowerCase
		final Function<String, String> lowercaseFunction1 = s -> s.toLowerCase();
		final Function<String, String> lowercaseFunction2 = String::toLowerCase;
		System.out.println(lowercaseFunction1.apply("NETAS"));
		System.out.println(lowercaseFunction2.apply("NETAS"));

		// method of a custom class
		final Company c = new Company("My_Company");
		final Supplier<String> lambdaSupplier = () -> c.getName();
		System.out.println(lambdaSupplier.get());

		final Supplier<String> referenceSupplier = c::getName;
		System.out.println(referenceSupplier.get());

		// method of a custom class
		final Predicate<Instructor> p1 = instructor -> instructor.isOnlineCourses();
		final Predicate<Instructor> p2 = Instructor::isOnlineCourses;
		System.out.println("---------------------");
		Instructors.getAll()
				.stream()
				.forEach(instructor -> {
					if (p1.test(instructor)) {
						System.out.println("Instructor " + instructor.getName() + " has online courses");
					}
				});

	}
}

class Company {
	String name;

	public Company() {

	}

	public Company(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
