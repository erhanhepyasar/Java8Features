package javaeight.d.streamapi.d.employeequeries;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Queries {
	static List<Employee> employeeList = new ArrayList<>();

	static {
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
	}

	public static void main(final String[] args) {

		System.out.println("1 : How many male and female employees are there in the organization?");

		final Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(noOfMaleAndFemaleEmployees);

		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n2 : Print the name of all departments in the organization?");

		employeeList.stream()
				.map(Employee::getDepartment)
				.distinct()
				.forEach(System.out::println);

		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n3 : What is the average age of male and female employees?");

		final Map<String, Double> avgAgeOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

		System.out.println(avgAgeOfMaleAndFemaleEmployees);

		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n4 : Get the details of highest paid employee in the organization?");

		final Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

		final Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
		System.out.println("ID : " + highestPaidEmployee.getId());
		System.out.println("Name : " + highestPaidEmployee.getName());
		System.out.println("Age : " + highestPaidEmployee.getAge());
		System.out.println("Gender : " + highestPaidEmployee.getGender());
		System.out.println("Department : " + highestPaidEmployee.getDepartment());
		System.out.println("Year Of Joining : " + highestPaidEmployee.getYearOfJoining());
		System.out.println("Salary : " + highestPaidEmployee.getSalary());

		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n5 : Get the names of all employees who have joined after 2015?");

		employeeList.stream()
				.filter(e -> e.getYearOfJoining() > 2015)
				.map(Employee::getName)
				.forEach(System.out::println);

		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n6 : Count the number of employees in each department?");

		final Map<String, Long> employeeCountByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		final Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

		for (final Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n7 : What is the average salary of each department?");

		final Map<String, Double> avgSalaryOfDepartments = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		final Set<Entry<String, Double>> entrySet2 = avgSalaryOfDepartments.entrySet();

		for (final Entry<String, Double> entry : entrySet2) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n8 : Get the details of youngest male employee in the product development department?");

		final Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper = employeeList.stream()
				.filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
				.min(Comparator.comparingInt(Employee::getAge));

		final Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();
		System.out.println("ID : " + youngestMaleEmployeeInProductDevelopment.getId());
		System.out.println("Name : " + youngestMaleEmployeeInProductDevelopment.getName());
		System.out.println("Age : " + youngestMaleEmployeeInProductDevelopment.getAge());
		System.out.println("Year Of Joinging : " + youngestMaleEmployeeInProductDevelopment.getYearOfJoining());
		System.out.println("Salary : " + youngestMaleEmployeeInProductDevelopment.getSalary());

		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n9 : Who has the most working experience in the organization?");

		final Optional<Employee> seniorMostEmployeeWrapper = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

		final Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
		System.out.println("ID : " + seniorMostEmployee.getId());
		System.out.println("Name : " + seniorMostEmployee.getName());
		System.out.println("Age : " + seniorMostEmployee.getAge());
		System.out.println("Gender : " + seniorMostEmployee.getGender());
		System.out.println("Age : " + seniorMostEmployee.getDepartment());
		System.out.println("Year Of Joinging : " + seniorMostEmployee.getYearOfJoining());
		System.out.println("Salary : " + seniorMostEmployee.getSalary());

		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n10 : How many male and female employees are there in the sales and marketing team?");

		final Map<String, Long> countMaleFemaleEmployeesInSalesMarketing = employeeList.stream()
				.filter(e -> e.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(countMaleFemaleEmployeesInSalesMarketing);

		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n11 : What is the average salary of male and female employees?");

		final Map<String, Double> avgSalaryOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(avgSalaryOfMaleAndFemaleEmployees);

		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n12 : List down the names of all employees in each department?");

		final Map<String, List<Employee>> employeeListByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		final Set<Entry<String, List<Employee>>> entrySet3 = employeeListByDepartment.entrySet();

		for (final Entry<String, List<Employee>> entry : entrySet3) {
			System.out.println("--------------------------------------");
			System.out.println("Employees In " + entry.getKey() + " : ");
			System.out.println("--------------------------------------");

			final List<Employee> list = entry.getValue();

			for (final Employee e : list) {
				System.out.println(e.getName());
			}
		}

		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n13 : What is the average salary and total salary of the whole organization?");

		final DoubleSummaryStatistics employeeSalaryStatistics = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));

		System.out.println("Average Salary = " + employeeSalaryStatistics.getAverage());
		System.out.println("Total Salary = " + employeeSalaryStatistics.getSum());

		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println(
				"\n14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");

		final Map<Boolean, List<Employee>> partitionEmployeesByAge = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));

		final Set<Entry<Boolean, List<Employee>>> entrySet4 = partitionEmployeesByAge.entrySet();

		for (final Entry<Boolean, List<Employee>> entry : entrySet4) {
			System.out.println("----------------------------");

			if (entry.getKey()) {
				System.out.println("Employees older than 25 years :");
			} else {
				System.out.println("Employees younger than or equal to 25 years :");
			}

			System.out.println("----------------------------");

			final List<Employee> list = entry.getValue();

			for (final Employee e : list) {
				System.out.println(e.getName());
			}
		}

		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println(
				"\n15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?");

		final Optional<Employee> oldestEmployeeWrapper = employeeList.stream()
				.max(Comparator.comparingInt(Employee::getAge));

		final Employee oldestEmployee = oldestEmployeeWrapper.get();
		System.out.println("Name : " + oldestEmployee.getName());
		System.out.println("Age : " + oldestEmployee.getAge());
		System.out.println("Department : " + oldestEmployee.getDepartment());

	}

}
