package javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample;

import java.util.List;
import java.util.function.Consumer;

import javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample.students.Student;
import javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample.students.Students;

public class ConsumerStudent {

	public static void main(final String[] args) {

		// displaying all students with their percentage.
		final Consumer<Student> percentageConsumer = student -> System.out
				.println(student.getName() + " : " + student.getPercentage());

		final List<Student> students = Students.getAll();

		for (final Student student : students) {
			percentageConsumer.accept(student);
		}

	}

}
