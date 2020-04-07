/*Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.*/



import java.util.Scanner;
public class interest {

	public static void main(String[] args) {
		
		System.out.println("Please Enter Gender ");
		System.out.println("MALE-1");
		System.out.println("FEMALE-2");
		Scanner scan=new Scanner(System.in);
		int gender=scan.nextInt();
		System.out.println("Enter your age");
		int age=scan.nextInt();
		if(gender==1)
		{
			if(age>0&&age<59)
			{
				System.out.println("Percentage of intrest for you is 8.4%");
			}
			else if(age>58&&age<101)
			{
				System.out.println("Percentage of intrest for you is 10.5%");
			}
			else
				System.out.println("The age is invalid");
		}
		else if(gender==2)
		{
			if(age>0&&age<59)
			{
				System.out.println("Percentage of intrest for you is 8.2%");
			}
			else if(age>58&&age<101)
			{
				System.out.println("Percentage of intrest for you is 9.2%");
			}
			else
				System.out.println("The age is invalid");
		}
		else
			System.out.println("The Gender you entered is invalid");
	    }
	

}
