package javaeight.d.streamapi.c.methods.d.collectors;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class GroupingMinMaxAvgExample {
	public static void main(final String[] args) {
		// grouping the instructors in two sets of online course vs not online
		// and get the max years of experience of the instructors
		final Map<Boolean, Optional<Instructor>> maxInstructors = Instructors.getAll()
				.stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
						Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience))));

		maxInstructors.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));
		System.out.println("---------");

		// collectingAndThen
		final Map<Boolean, Instructor> maxInstructors1 = Instructors.getAll()
				.stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
						Collectors.collectingAndThen(
								Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)),
								Optional::get)));

		maxInstructors1.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));

		// average years of experience of instructors who teaches online or not

		final Map<Boolean, Double> maxInstructors2 = Instructors.getAll()
				.stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
						Collectors.averagingInt(
								Instructor::getYearsOfExperience)));
		System.out.println("---------");
		maxInstructors2.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));

		// drive a statistical summary from properties of grouped items

		final Map<Boolean, IntSummaryStatistics> maxInstructors3 = Instructors.getAll()
				.stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
						Collectors.summarizingInt(
								Instructor::getYearsOfExperience)));
		System.out.println("---------");
		maxInstructors3.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));

	}
}
