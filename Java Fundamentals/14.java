/*Write a Java program to find if the given number is prime or not.

Example1)
C:\>java Sample 
O/P: Please enter an integer number 

Example2)
C:\>java Sample 1
O/P:1 is neither prime nor composite

Example3)
C:\>java Sample 0
O/P: 0 is neither prime nor composite
 
Example4)
C:\>java Sample 10
O/P: 10 is not a prime number

Example5)
C:\>java Sample 7
O/P : 7 is a prime number*/


package compositeNumbers;
import java.util.Scanner;
public class composite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	     int i,j,h=0;
	     System.out.print("Enter the number to the number is prime or not");
	     i=scan.nextInt();
	     if(i>2)
	     {
	     for(j=2;j<=i/2;j++)
	     {
	    	 if(i%j==0)
	    	 {
	    		 h++;
	    	 }
	     }
	     }
	     else
	    	 System.out.print("Nither prime nor composite number");
	     if(h>0)
	     {
	    	 System.out.print(" Not prime and Composite Number");
	     }
	     else
	     {
	    	 System.out.print("Prime");
	     }
	}

}
