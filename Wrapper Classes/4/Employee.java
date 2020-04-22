public class Employee implements Cloneable {
private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
//	public Employee(Employee emp) {
//		this.name = emp.name;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
}
