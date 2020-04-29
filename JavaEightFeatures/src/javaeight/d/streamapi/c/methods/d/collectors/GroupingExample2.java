package javaeight.d.streamapi.c.methods.d.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class GroupingExample2 {
	public static void main(final String[] args) {
		// grouping by length of string and also checking that the names contains e
		// and only return those name which has e in it
		final List<String> name = List.of("Sid", "Mike", "Jenny", "Gene", "Rajeev");
		final Map<Integer, List<String>> result = name.stream()
				.collect(Collectors.groupingBy(String::length, Collectors
						.filtering(s -> s.contains("e"), Collectors.toList())));

		System.out.println("result = " + result);
		System.out.println("------------------");

		// instructor grouping them by Senior(>10) and Junior(<10) and filter them
		// on online courses
		final Map<String, List<Instructor>> instructorByExpAndOnline = Instructors.getAll()
				.stream()
				.collect(Collectors.groupingBy(
						instructor -> instructor.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR",
						Collectors.filtering(s -> s.isOnlineCourses(),
								Collectors.toList())));

		instructorByExpAndOnline.forEach((key, value) -> {
			System.out.println("key  = " + key + " value = " + value);
		});
	}
}
