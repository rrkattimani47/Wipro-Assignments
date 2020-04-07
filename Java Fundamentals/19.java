//Write a program to print first 5 values which are divisible by 2, 3, and 5.



package divisor;
import java.util.Scanner;

public class finddivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to print the divisors");
		int i,number,n;
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		n=0;
		System.out.print("0"+"\t");
		i=2;
		   while(i<number)
		   {
			if(i%2==0 || i%3==0 || i%5==0)
			{
				System.out.print(i+"\t");
			   
			}
			i++;
		   }
	}

}
