package ProblemSet;

import java.util.*;

public class sortGame {
	static class Employee {
		public String name;
		public int salary;

		Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}
	}

	public static void main(String args[]) {
		// Your Code Here
		Scanner s = new Scanner(System.in);

		int x = s.nextInt();
		int n = s.nextInt();
		ArrayList<Employee> empList = new ArrayList<Employee>();
		for (int i = 0; i < n; i++) {
			String name = s.next();
			int salary = s.nextInt();

			if (salary >= x) {
				Employee emp = new Employee(name, salary);
				empList.add(emp);
			}
		}

		Collections.sort(empList, new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				if (emp1.salary == emp2.salary) {
					return emp1.name.compareTo(emp2.name);
				}
				return emp2.salary - emp1.salary;
			}
		});
		for (Employee emp : empList) {
			System.out.println(emp.name + " " + emp.salary);
		}

	}
}