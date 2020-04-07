/*Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)
C:\>java Sample 
O/P: Please enter an integer number

Example2)
C:\>java Sample 3
O/P :
*
*  * 
*  *  *   */


package starPattern;
import java.util.Scanner;

public class triangle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rows;
		 System.out.println("Enter the number : ");
		 Scanner input=new Scanner(System.in);
		 rows=input.nextInt();
	        for(int i = 1; i <= rows; ++i) {
	            for(int j = 1; j <= i; ++j) {
	                System.out.print("* ");
	            }
	            System.out.println();
	}

}
}
