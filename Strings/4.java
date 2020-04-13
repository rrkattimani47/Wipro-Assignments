/*Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.

Example1)
i/p:TomCat
o/p:Tom

Example2)
i/p:Apron
o/p:null*/

import java.util.Scanner;
public class HalfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String TomCat: ");
		Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(firstHalf(str));
    }

     static String firstHalf(String s) {
        int l = s.length();

         if((l & 1) == 1)
            return null;
        else
            return s.substring(0, l/2);
	}

}
