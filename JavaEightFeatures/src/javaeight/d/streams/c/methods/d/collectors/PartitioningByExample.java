package javaeight.d.streams.c.methods.d.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class PartitioningByExample {
	public static void main(final String[] args) {
		// partition instructors in two groups of instructor
		// first is years of experience is > 10 and other is <=10
		final Predicate<Instructor> experiencePredicate = instructor -> instructor.getYearsOfExperience() > 10;
		final Map<Boolean, List<Instructor>> partitionMap = Instructors.getAll()
				.stream().collect(Collectors.partitioningBy(experiencePredicate));
		partitionMap.forEach((key, value) -> {
			System.out.println("key = " + key + " value = " + value);
		});
		System.out.println("-------------------------------");

		// partition but return is set instead of list

		final Map<Boolean, Set<Instructor>> partitionSet = Instructors.getAll()
				.stream().collect(Collectors.partitioningBy(experiencePredicate,
						Collectors.toSet()));
		partitionSet.forEach((key, value) -> {
			System.out.println("key = " + key + " value: " + value);
		});

	}
}
