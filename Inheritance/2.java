/*Create a class called Person with a member variable name. Save it in a file called Person.java

Create a class called Employee that will inherit the Person class.The other data members of the Employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java

Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to fully test your class definition.*/

//Class Person
public class Person {
 String name;
}
//Class Employee
public class Employee extends Person{
	 double annualSalary;
     int yearOfStart;
     String insuranceNumber;

      Employee() {
         name = "NoName";
         annualSalary = 1000000;
         yearOfStart = 2017;
         insuranceNumber = "0142512";
     }

      Employee(String name, double salary, int year, String insurance) {
         this.name = name;
         annualSalary = salary;
         yearOfStart = year;
         insuranceNumber = insurance;
     }

      String getName() {
         return name;
     }
     double getAnnualSalary() {
         return annualSalary;
     }

      int getYearOfStart() {
         return yearOfStart;
     }

      String getInsurancenumber() {
         return insuranceNumber;
     }
     
     
     //Class TestEmployee is main class
     public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e = new Employee("Rashmi Kattimani", 800000, 2020, "1234567");

         System.out.println("Details of Employee:");
        System.out.println("Name: " + e.getName());
        System.out.println("Year Of Starting: " + e.getYearOfStart());
        System.out.println("Annual Salary: " + e.getAnnualSalary());
        System.out.println("Insurance Number: " + e.getInsurancenumber());
	}

}

}
