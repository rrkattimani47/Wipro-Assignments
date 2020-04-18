/*Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)*/



import java.util.Scanner;
public class Exception6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Name of the Student :");
Scanner sc = new Scanner(System.in);
System.out.println("Enter the values of 3 subjects:");
		for (int i = 0; i < 2; i++) {
			String name = "";
			int subA = 0;
			int subB = 0;
			int subC = 0;
			
			try {				
				name = sc.nextLine();
				
				if (sc.hasNextInt())
					subA = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					subB = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					subC = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (subA < 0) throw new NegativeValueException();
				if (subA > 100) throw new ValuesOutOfRangeException();
				
				if (subB < 0) throw new NegativeValueException();
				if (subB > 100) throw new ValuesOutOfRangeException();
				
				if (subC < 0) throw new NegativeValueException();
				if (subC > 100) throw new ValuesOutOfRangeException();
				
				
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (NegativeValueException e) {
				System.out.println(e.getMessage());
			} catch (ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Name: " + name);
			System.out.println("Marks of subject A: " + subA);
			System.out.println("Marks of subject B: " + subB);
			System.out.println("Marks of subject C: " + subC);
		}
		
		sc.close();
	}

}
