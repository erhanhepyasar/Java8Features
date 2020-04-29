package javaeight.b.lambda.c.lambdafunctionalinterface.a.studentexample.students;

public class Student {
	int id;
	String name;
	double percentage;
	String specialization;

	public Student(final int id, final String name, final double percentage, final String specialization) {
		this.id = id;

		this.name = name;

		this.percentage = percentage;

		this.specialization = specialization;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getSpecialization() {
		return specialization;
	}

	@Override
	public String toString() {
		return id + "-" + name + "-" + percentage + "-" + specialization;
	}
}
