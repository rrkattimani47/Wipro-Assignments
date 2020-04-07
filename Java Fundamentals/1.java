// Write a program to check if the given integer number is positive, negative or zero
import java.util.Scanner;


public class evenorodd {

	public static void main(String[] args)
	{
		int num;
		
		
		System.out.println("Enter an Integer number:"); 
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();
	    	
	    if(num>0)
	    {
	    	System.out.println("Number is Positive");
	    	
	    }
	    if(num<0)
	    {
	    	System.out.println("Number is negative");
	    }
	    if(num==0)
	    {
	    	System.out.println("Number is zero"); 
	    	
	    }
	    
	    
	}

}
