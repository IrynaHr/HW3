package edu;
public class EmployeeMain {

	public static void main(String[] args) {
		Employee em1 = new Employee();
		em1.setName("Ira");
		em1.setRate(5);
		em1.setHour(10);

		Employee em2 = new Employee("Olia", 4, 11);

		Employee em3 = new Employee("Natalia", 4, 15);
		System.out.println(Employee.totalSum);
		System.out.println(em1);
		System.out.println(em2);
		System.out.println(em3);

		System.out.println(Employee.totalSum);

	}

}
