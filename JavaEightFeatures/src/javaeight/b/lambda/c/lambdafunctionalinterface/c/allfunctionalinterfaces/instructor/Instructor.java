package javaeight.b.lambda.c.lambdafunctionalinterface.c.allfunctionalinterfaces.instructor;

import java.util.List;

public class Instructor {
	String name;
	int yearsOfExperience;
	String title;
	String gender;
	boolean onlineCourses;
	List<String> courses;

	public Instructor(final String name, final int yearsOfExperience, final String title, final String gender,
			final boolean onlineCourses, final List<String> courses) {
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
		this.title = title;
		this.gender = gender;
		this.onlineCourses = onlineCourses;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor{" +
				"name='" + name + '\'' +
				", yearsOfExperience=" + yearsOfExperience +
				", title='" + title + '\'' +
				", gender='" + gender + '\'' +
				", onlineCourses=" + onlineCourses +
				", courses=" + courses +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(final int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(final String gender) {
		this.gender = gender;
	}

	public boolean isOnlineCourses() {
		return onlineCourses;
	}

	public void setOnlineCourses(final boolean onlineCourses) {
		this.onlineCourses = onlineCourses;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(final List<String> courses) {
		this.courses = courses;
	}
}
