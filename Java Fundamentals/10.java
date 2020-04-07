// Write a program to print numbers from 1 to 10 in a single row with one tab space.

package numbers1to100;

public class numbers 
{

	public static void main(String[] args)
	{
		int n = 10;
		System.out.print(" Numbers from 1 to "+n+" are: ");
		for (int i = 1; i <= n; i++) 
		{
		   
			System.out.print(i + "\t ");

		}
	}
}
