package javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample.students.Student;
import javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample.students.Students;

public class PredicateStudent {

	public static void main(final String[] args) {

		// list of “Mathematics” students from the above list of students.
		final Predicate<Student> mathematicsPredicate = student -> student.getSpecialization().equals("Mathematics");

		final List<Student> mathematicsStudents = new ArrayList<>();

		for (final Student student : Students.getAll()) {
			if (mathematicsPredicate.test(student)) {
				mathematicsStudents.add(student);
			}
		}

		System.out.println(mathematicsStudents);

	}

}
