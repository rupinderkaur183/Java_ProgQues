package streams.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOperations {
	public static void main(String args[]) {
		//Creating a lit of Employee and adding values
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
		
		//Group the Employees by city.
		Map<String, List<Employee>> empByCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println("Group by City ::"+ empByCity);
		
		//Group the Employees by age.
		Map<Integer, List<Employee>> ageList = empList.stream().collect(Collectors.groupingBy(e->e.getAge()));
		ageList.forEach((age,employees)-> {
		System.out.println("Group by Age :"+ age);
		employees.forEach(System.out::println);
		}	);
		
		// Find the count of male and female employees present in the organization.
		Map<String,Long> empGender = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println("#### count of male and female employees ####");
		System.out.println("count of male and female employees ::"+ empGender);
	
		//Print the names of all departments in the organization.
		System.out.println("#### names of all departments in the organization ####");
		empList.stream().map(e->e.getDeptName()).distinct().forEach(System.out::println);
		
		//Print employee details whose age is greater than 28.
		System.out.println("#### employee details whose age is greater than 28 ####");
		empList.stream().filter(e->e.getAge()>28).collect(Collectors.toList()).forEach(System.out::println);
		
		//Find maximum age of employee using n value.
		Employee maxAgeEmp = empList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList()).get(0);
		System.out.println("#### maximum age of employee using n value ####");
		System.out.println(maxAgeEmp);
		
		//Find maximum age of employee using Max Function.
		Employee maxAgeEmp2 =  empList.stream().collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)), e -> e.get()));
		System.out.println("#### maximum age of employee using Max Function ####");
		System.out.println(maxAgeEmp2);
		
		//Find maximum salary of employee using Max Function group by department.
		Map<String, Employee> salaryDept = empList.stream().collect(Collectors.groupingBy(Employee:: getDeptName, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), e->e.get())));
		System.out.println("#### maximum salary of employee using Max Function group by department ####");
		System.out.println(salaryDept);
	
		//Print Average age of Male and Female Employees.
		Map<String, Double> empAvgGender = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("#### Average age of Male and Female Employees ####");
		System.out.println(empAvgGender);
	
		//Print the number of employees in each department.
		Map<String, Long> deptCount = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
		System.out.println("#### the number of employees in each department ####");
		System.out.println(deptCount);
		for(Map.Entry<String, Long> mp :deptCount.entrySet()) {
			System.out.println("Key : " + mp.getKey() + " Value : "+ mp.getValue());
		}
	
		// Find oldest employee.
		Employee OrderestEmp = empList.stream()
		.collect(Collectors
				.collectingAndThen(Collectors
						.maxBy(Comparator.comparing(Employee::getAge)), e->e.get()));
	
		System.out.println("Way 1 Oldest Emp :: " + OrderestEmp);
		
		Optional<Employee> OrderestEmp2 = empList.stream().max(Comparator.comparing(Employee::getAge));
		System.out.println("Way 2 Oldest Emp :: " + OrderestEmp2);
		
		
		// Find youngest female employee.
		Optional<Employee> youngest = empList.stream().filter(e -> e.getGender()== "F").min(Comparator.comparing(Employee::getAge));
		System.out.println("youngest Emp :: " + youngest.get());
		
		//Find the department name which has the highest number of employees.
		Optional<Entry<String, Long>> mapdeptcount = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue());
		System.out.println("mapdeptcount :: " + mapdeptcount.get().getKey());
		
		//Find if there any employees from HR Department.
		Optional<Employee> HRList = empList.stream().filter(e -> e.getDeptName().equalsIgnoreCase("HR")).findAny();
		HRList.ifPresent(emp -> System.out.println("Find if there any employees from HR Department :: " + emp));
		
		//14. Find the department names that these employees work for, where the number of employees in the department is over 3.
		
		
	}
	
}
