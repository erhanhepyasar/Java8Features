package javaeight.d.streams.c.methods.a.operations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class EFilterExample {
	public static void main(final String[] args) {
		// returning instructors sorted by their name and have more that 10 years of experience

		final List<Instructor> list = Instructors.getAll().stream()
				.filter(instructor -> instructor.getYearsOfExperience() > 10)
				.sorted(Comparator.comparing(Instructor::getName))
				.collect(Collectors.toList());

		list.forEach(System.out::println);

	}
}
