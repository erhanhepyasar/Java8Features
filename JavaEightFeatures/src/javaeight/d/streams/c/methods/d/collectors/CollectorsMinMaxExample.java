package javaeight.d.streams.c.methods.d.collectors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class CollectorsMinMaxExample {
	public static void main(final String[] args) {
		// instructor with minimum years of experience
		Optional<Instructor> instructor = Instructors.getAll().stream()
				.collect(Collectors.minBy(Comparator.comparing(
						Instructor::getYearsOfExperience)));
		System.out.println("instructor = " + instructor);
		System.out.println("---------------");

		instructor = Instructors.getAll().stream()
				.min(Comparator.comparing(Instructor::getYearsOfExperience));
		System.out.println("instructor = " + instructor);

		instructor = Instructors.getAll().stream()
				.collect(Collectors.maxBy(Comparator.comparing(
						Instructor::getYearsOfExperience)));
		System.out.println("instructor = " + instructor);
		System.out.println("---------------");

		instructor = Instructors.getAll().stream()
				.max(Comparator.comparing(Instructor::getYearsOfExperience));
		System.out.println("instructor = " + instructor);

	}
}
