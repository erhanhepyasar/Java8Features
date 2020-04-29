package javaeight.d.streamapi.c.methods.d.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class Demo {

	public static void main(final String[] args) {

		final List<Instructor> instructors = Instructors.getAll();

		final Map<String, List<Instructor>> collect1 = instructors.stream()
				.collect(Collectors.groupingBy(Instructor::getGender));

		collect1.forEach((k, v) -> System.out.println(k + " - " + v));

		final Map<String, List<Instructor>> collect2 = instructors.stream()
				.collect(Collectors.groupingBy(i -> i.getYearsOfExperience() > 10 ? "Senior" : "Junior"));

		collect2.forEach((k, v) -> System.out.println(k + " - " + v));
	}

}
