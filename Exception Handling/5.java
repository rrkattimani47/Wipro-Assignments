/*Write a Program with a division method which receives two integer numbers and performs the division operation. 

The method should declare that it throws ArithmeticException. This exception should be handled in the main method.*/

import java.util.Scanner;
public class Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Division of values a and b is carried out!!");
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		
		try {
			double r = division(a, b);
			System.out.println(r);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
	
	public static double division(int a, int b) throws ArithmeticException {
		return a / b;
	}

}
