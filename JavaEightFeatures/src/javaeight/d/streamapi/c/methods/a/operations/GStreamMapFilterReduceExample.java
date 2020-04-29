package javaeight.d.streamapi.c.methods.a.operations;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class GStreamMapFilterReduceExample {
	public static void main(final String[] args) {
		// total years of experience b/w instructors
		final int result = Instructors.getAll().stream()
				.filter(Instructor::isOnlineCourses)
				.map(Instructor::getYearsOfExperience)
				.reduce(0, Integer::sum); // .reduce(0, (y1, y2) -> y1 + y2);

		System.out.println(result);

	}
}
