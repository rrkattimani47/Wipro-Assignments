/*Write a java program that accepts a string and returns a new string without the first and last character of the input string.

Example1)
i/p:Suman
o/p:uma*/

import java.util.Scanner;
public class MiddleChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Program to extract only middle characters, exclude first and last\n");
		 System.out.println("Enter the string");
		Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(trimFirstLast(str));
    }

     static String trimFirstLast(String s) {
        return s.substring(1, s.length()-1);
	}

}
