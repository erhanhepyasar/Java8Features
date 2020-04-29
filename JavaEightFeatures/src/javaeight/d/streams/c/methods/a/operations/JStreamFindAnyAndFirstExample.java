package javaeight.d.streams.c.methods.a.operations;

import java.util.Optional;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class JStreamFindAnyAndFirstExample {
	public static void main(final String[] args) {
		Optional<Instructor> instructorOptional = Instructors.getAll().stream()
				.findAny();
		if (instructorOptional.isPresent())
			System.out.println(instructorOptional.get());

		instructorOptional = Instructors.getAll().stream().findFirst();
		if (instructorOptional.isPresent())
			System.out.println(instructorOptional.get());

	}
}
