package javaeight.d.streams.c.methods.a.operations;

import java.util.Set;
import java.util.stream.Collectors;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class AMapExample {
	public static void main(final String[] args) {
		// return only instructor names from the instructor list
		final Set<String> instructorNames = Instructors.getAll().stream()
				.map(Instructor::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toSet());
		System.out.println(instructorNames);
	}
}
