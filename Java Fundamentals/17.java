/* Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001*/

package reverseNumber;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, reversed = 0;
		System.out.println("Enter a number: ");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
	}

}
