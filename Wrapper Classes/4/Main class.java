/*Create an employee class with properties of your choice. 
Create an object of this class and also create a clone of the same. 
After making the clone, change the properties of the original employee object and print the properties of both the 
original and clone object and note down your observation.*/

public class Rashmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Rashmi Kattimani");
		Employee empClone = emp.clone();
		
		empClone.setName("Betty Cooper");
		
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}

}
