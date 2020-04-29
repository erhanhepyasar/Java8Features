package javaeight.d.streams.c.methods.d.collectors;

import java.util.List;

import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructor;
import javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor.Instructors;

public class DemoCount {

	public static void main(final String[] args) {
		final List<Instructor> instructors = Instructors.getAll();

		final long count1 = instructors.stream().count();
		System.out.println(count1);
	}

}
