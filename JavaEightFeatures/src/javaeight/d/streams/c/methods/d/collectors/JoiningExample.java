package javaeight.d.streams.c.methods.d.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class JoiningExample {
	public static void main(final String[] args) {
		String result = Stream.of("E", "F", "G", "H").collect(Collectors.joining());
		System.out.println(result);

		result = Stream.of("E", "F", "G", "H").collect(Collectors.joining(","));
		System.out.println(result);

		result = Stream.of("E", "F", "G", "H").collect(Collectors.joining(",", "{", "}"));
		System.out.println(result);

		// instructors names seperated by ' and prefix { and suffix }
		final String namesConcatenated = Instructors.getAll().stream()
				.map(Instructor::getName)
				.collect(Collectors.joining(",", "{", "}"));
		System.out.println("namesConcatenated = " + namesConcatenated);

	}
}
