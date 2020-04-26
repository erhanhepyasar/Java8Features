package javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample;

import java.util.function.Supplier;

import javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample.students.Student;

public class SupplierStudent {

	public static void main(final String[] args) {

		// Creating a new Student
		final Supplier<Student> studentSupplier = () -> new Student(111111, "New Student", 92.9, "Java 8");

		System.out.println(studentSupplier.get());

	}

}
