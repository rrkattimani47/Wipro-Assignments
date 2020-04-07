// Write a program to print prime numbers between 10 and 99.


package primenumbers;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (i = 10; i <= 99; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 10 to 99 are :");
	       System.out.println(primeNumbers);

}
}
