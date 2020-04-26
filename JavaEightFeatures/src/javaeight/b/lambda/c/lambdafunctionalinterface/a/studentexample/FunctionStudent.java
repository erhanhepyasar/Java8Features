package javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample.students.Student;
import javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample.students.Students;

public class FunctionStudent {

	public static void main(final String[] args) {

		// extracting only the names from list of students
		final Function<Student, String> nameFunction = student -> student.getName();

		final List<String> studentNames = new ArrayList<>();

		for (final Student student : Students.getAll()) {
			studentNames.add(nameFunction.apply(student));
		}

		System.out.println(studentNames);

	}

}
