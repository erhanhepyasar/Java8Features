package javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample;

import java.util.function.Consumer;

import javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample.students.Student;
import javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample.students.Students;

public class ConsumerStudent {

	public static void main(final String[] args) {

		// displaying all students with their percentage.
		final Consumer<Student> percentageConsumer = (final Student student) -> {
			System.out.println(student.getName() + " : " + student.getPercentage());
		};

		for (final Student student : Students.getAll()) {
			percentageConsumer.accept(student);
		}

	}

}
