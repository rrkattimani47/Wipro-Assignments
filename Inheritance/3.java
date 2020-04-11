/*Create a school application with a class called Person. Create name and dateOfBirth as member variables.

Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary, and the subject that the teacher teaches.

Create a class called Student that inherits from Person class. This class will have a member variable called studentId. 

Create a class called College Student that inherits from Student class. This class will have collegeName, the year in which the student is studying (first/second/third/fourth) etc.

Create objects of each of this classes, invoke and test the methods that are available in these classes.*/

//Class Person
public class Person {
String name;
int dateOfBirth;
}

//Class Student
public class Student extends Person {
int studentId;
}

//Class Teacher
public class Teacher extends Person {
	String subject;
    double salary;

     Teacher(String n,String sub, double s) {
        name = n;
    
        subject = sub;
        salary = s;
        
}

     void display() {
         System.out.println("Name of Teacher: " + name + ", Subject: " + subject + ", Salary: " + salary);
     }
}

//Class CollegeStudent
public class CollegeStudent extends Student{
	int year;
    String major;

     CollegeStudent(String n, int studentId, int y, String m) {
        name = n;
        studentId = studentId;
        year = y;
        major = m;
    }

     void display() {
        System.out.println("Name: " + name + ", Student ID: " + studentId + ", year: " + year + ", Major: " + major);
    }
}

//main Class
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher("Rupert Chipping", "Baxter Brother ", 8000000);
        CollegeStudent s = new CollegeStudent("Rashmi", 105, 4, "Literature");
        t.display();
        s.display();
	}

}
