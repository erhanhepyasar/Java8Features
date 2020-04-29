package javaeight.d.streams.c.methods.a.operations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class DStreamComparatorExample {
	public static void main(final String[] args) {
		// retuning all instructors sorted by their name - reverse
		final List<Instructor> list = Instructors.getAll().stream()
				.sorted(Comparator.comparing(Instructor::getName).reversed())
				.collect(Collectors.toList());

		list.forEach(System.out::println);

		// retuning names of instructors sorted - reverse
		final List<String> list2 = Instructors.getAll().stream()
				.map(Instructor::getName)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		list2.forEach(System.out::println);
	}
}
