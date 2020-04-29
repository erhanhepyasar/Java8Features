package javaeight.d.streamapi.c.methods.a.operations;

import java.util.List;
import java.util.stream.Collectors;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class CStreamsOperations {
	public static void main(final String[] args) {
		// count distinct
		final Long count = Instructors.getAll().stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.distinct()
				.count();

		System.out.println(count);

		// distinct, sorted
		final List<String> courses = Instructors.getAll().stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(courses);

		// anymatch, allmatch and nonmatch
		final boolean match = Instructors.getAll().stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.anyMatch(s -> s.startsWith("J"));

		System.out.println(match);

	}
}
