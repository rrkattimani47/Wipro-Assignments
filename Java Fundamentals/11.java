
// Write a program to print even numbers between 23 and 57. Each number should be printed in a separate row.


package numbers1to100;

public class numbers 
{

	public static void main(String[] args)
	{
		int n = 57;
		System.out.print(" Numbers from 1 to "+n+" are: ");
		for (int i = 23; i <= n; i++) 
		{
		 //  if number%2 == 0 it means its an even number
		  if (i % 2 == 0)
		   {
			System.out.print(i + "\t ");

		   }

		}
	}
}
