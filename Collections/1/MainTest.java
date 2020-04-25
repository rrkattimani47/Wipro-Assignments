/*1) Create an application for employee management with the following classes:

a) Create an Employee class with following attributes and behaviors :
i) int empId
ii)String empName
iii)String email
iv)String gender 
v)float salary
vi) void GetEmployeeDetails() -> prints employee details

b) Create one more class EmployeeDB with the following attributes and behaviors.
(i)ArrayList list;
ii) boolean addEmployee(Employee e)  -> adds the employee object to the collection
iii) boolean deleteEmployee(int empId)  ->delete the employee object from the collection with the given empid
iv) String showPaySlip(int empId)  -> returns the payslip of the employee with the given empId

Provide implementation for all the methods and test your program.*/



public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(101, "Rashmi Kattimani", "rrk@yahoo.com", 'F', 75000);
		Employee emp2 = new Employee(102, "Betty Cooper", "betty@w3epic.com", 'F', 30000);
		Employee emp3 = new Employee(103, "Jughead Jones", "jones@gmail.com.com", 'M', 20000);
		Employee emp4 = new Employee(104, "Archie Andrews", "archie@yahoo.com", 'M', 50000);
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		empDb.deleteEmployee(102);
		
		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(103));
	}

}
