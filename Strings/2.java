/*Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar

Example2)
i/p:Mark,kate
o/p:markate*/


import java.util.Scanner;
public class Strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String s1: ");
		 Scanner in = new Scanner(System.in);
         String s1 = "", s2 = "";
         s1 = in.nextLine();
         System.out.println("Enter String s2: ");
         s2 = in.nextLine();

          System.out.println(appendThemTogether(s1, s2));
       
     }

      static String appendThemTogether(String a, String b) {
         String s = "";
         if (a.charAt(a.length()-1) == b.charAt(0)) {
             s = a.substring(0, a.length()-2) + b;
         }
         else {
             s = a + b;
         }
         s.toLowerCase();
         return s;
	}

}




