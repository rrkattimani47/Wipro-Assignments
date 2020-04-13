/*Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.

Example1)
i/p:Hello,World
o/p:HWeolrllod*/


import java.util.Scanner;
public class Strings9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter String a: ");
        String a = in.nextLine();
        System.out.print("Enter String b: ");
        String b = in.nextLine();
        System.out.print(mergeStrings(a, b));
    }

     static String mergeStrings(String a, String b) {
        String bigger = "";
        int l1 = a.length(), l2 = b.length(), l = (l1 < l2)? l1 : l2, i;
        for(i = 0; i < l; i++) {
            bigger += a.charAt(i);
            bigger += b.charAt(i);
        }
        while(i <l1) {
            bigger += a.charAt(i);
            i++;
        }
        while(i <l2) {
            bigger += b.charAt(i);
            i++;
        }
        return bigger;
	}

}
