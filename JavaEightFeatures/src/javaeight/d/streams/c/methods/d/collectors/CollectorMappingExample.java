package javaeight.d.streams.c.methods.d.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class CollectorMappingExample {
	public static void main(final String[] args) {
		// map
		List<String> namesList = Instructors.getAll().stream()
				.map(Instructor::getName)
				.collect(Collectors.toList());
		namesList.forEach(System.out::println);

		// mapping
		namesList = Instructors.getAll().stream()
				.collect(Collectors.mapping(Instructor::getName, Collectors.toList()));

		namesList.forEach(System.out::println);

		// Instructors by their years of experience
		final Map<Integer, List<String>> mapYearsOfExperienceAndNames = Instructors.getAll().stream()
				.collect(Collectors.groupingBy(Instructor::getYearsOfExperience,
						Collectors.mapping(Instructor::getName, Collectors.toList())));

		mapYearsOfExperienceAndNames.forEach((key, value) -> {
			System.out.println("key = " + key + " value = " + value);
		});

	}
}
