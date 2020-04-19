/* Write a Program to accept a String as a command line argument and print a Welcome message as given below.

Example1)
C:\> java Sample John
O/P Expected : Welcome John*/

//GIve the input in run configuration- arguments section
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome " + args[0]);
	}

}
