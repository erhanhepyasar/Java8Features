package javaeight.d.streamapi.c.methods.d.collectors;

import java.util.stream.Collectors;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class CountingExample {
	public static void main(final String[] args) {
		// count the numbers of instructors who teaches online courses
		// stream.count
		long count = Instructors.getAll().stream()
				.filter(Instructor::isOnlineCourses)
				.count();
		System.out.println(count);

		// collectors.counting
		count = Instructors.getAll().stream()
				.filter(Instructor::isOnlineCourses)
				.collect(Collectors.counting());
		System.out.println("count = " + count);

	}
}
