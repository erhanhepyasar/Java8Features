package javaeight.d.streamapi.c.methods.d.collectors;

import java.util.stream.Collectors;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class CollectorSummingAveragingExample {
	public static void main(final String[] args) {
		// sum of years of experience of all instructor
		final int sum = Instructors.getAll().stream()
				.collect(Collectors.summingInt(Instructor::getYearsOfExperience));

		System.out.println("sum = " + sum);

		// calculate average of years of experience of all instructors
		final double average = Instructors.getAll().stream()
				.collect(Collectors.averagingInt(Instructor::getYearsOfExperience));

		System.out.println("average = " + average);

	}
}
