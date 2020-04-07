
/* Write a program to print the sum of all the digits of a given number.

Example1) 
I/P:1234
O/P:10 */





import java.util.Scanner;
public class digitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int m, n, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        m = s.nextInt();
	        while(m > 0)
	        {
	            n = m % 10;
	            sum = sum + n;
	            m = m / 10;
	        }
	        System.out.println("Sum of Digits:"+sum);
	}

}
