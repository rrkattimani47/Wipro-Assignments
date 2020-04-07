//Write a java program to check if the given integer is odd or even

import java.util.Scanner;


public class evenorodd {

	public static void main(String[] args)
	{
		int num;
		
		
		System.out.println("Enter an Integer number:"); 
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();
	    	
	 
	    
	   	if (num % 2 == 0 )
	        System.out.println("Entered num is even");
	     else
	        System.out.println("Entered num is odd");
	    		
	    	
	}

}
