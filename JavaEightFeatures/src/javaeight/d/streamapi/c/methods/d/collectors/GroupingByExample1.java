package javaeight.d.streamapi.c.methods.d.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class GroupingByExample1 {
	public static void main(final String[] args) {
		// group list of name by their length
		final List<String> names = List.of("Syed", "Mike", "Jenny", "Gene", "Rajeev");

		final Map<Integer, List<String>> result = names.stream()
				.collect(Collectors.groupingBy(String::length));

		System.out.println("result = " + result);

		System.out.println("-----------------");

		// grouping by instructors by their gender
		final Map<String, List<Instructor>> instructorByGender = Instructors.getAll()
				.stream().collect(Collectors.groupingBy(Instructor::getGender));

		instructorByGender.forEach((key, value) -> {
			System.out.println("key = " + key + " value = " + value);
		});

		System.out.println("-----------------");

		// grouping by experience where >10 years of experience is classified
		// as Senior and others are junior
		final Map<String, List<Instructor>> instructorsByExperience = Instructors.getAll()
				.stream().collect(Collectors.groupingBy(instructor -> instructor
						.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR"));

		instructorsByExperience.forEach((key, value) -> {
			System.out.println("key = " + key + " value = " + value);
		});
	}
}
