package javaeight.d.streamapi.c.methods.a.operations;

import java.util.Optional;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class FStreamReduceExample2 {
	public static void main(final String[] args) {
		// printing the instructor who has the highest years of experience
		final Optional instructor = Instructors.getAll().stream()
				.reduce((s1, s2) -> s2.getYearsOfExperience() > s1.getYearsOfExperience() ? s2 : s1);
		if (instructor.isPresent())
			System.out.println(instructor.get());

	}
}
