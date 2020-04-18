/*Get an input String from user and parse it to integer, if it is not a number it will throw number format exception Catch it and print "Entered input is not a valid format for an integer." or else print the square of that number. (Refer Sample Input and Output). 

Sample input and output 1: 
Enter an integer: 12
The square value is 144
The work has been done successfully

Sample input and output 2:
Enter an integer: Java
Entered input is not a valid format for an integer.*/

import java.util.Scanner;
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		String str = sc.nextLine();
		
		try {
			int x = Integer.parseInt(str);
			System.out.println("The square value is: " + x * x);
			System.out.println("The work has been done successfully");
		} catch (NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
			//e.printStackTrace();
		}
		
		sc.close();

	}

}
