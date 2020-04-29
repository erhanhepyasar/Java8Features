package javaeight.d.streams.c.methods.a.operations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class BFlatMapExample {
	public static void main(final String[] args) {
		// Get a list of all the courses which instructors offers
		final Set<String> instructorsCourses = Instructors.getAll().stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.collect(Collectors.toSet());
		System.out.println(instructorsCourses);

		// Without flatMap:
		final List<List<String>> instructorsCoursesMap = Instructors.getAll().stream()
				.map(Instructor::getCourses)
				.collect(Collectors.toList());
		System.out.println(instructorsCoursesMap);
	}
}
