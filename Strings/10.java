/*Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 

Example1)
i/p:Wipro,3
o/p:propropro*/

import java.util.*;
public class Strings10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String:");
		Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Enter the number of times last letters to be repeated:");
        int n = in.nextInt();
        System.out.println(nlastRepeat(str, n));
    }

     static String nlastRepeat(String s, int n) {
        String r = s.substring(s.length()-n);
        String big = "";
        for(int i=0;i<n; i++) {
            big += r;
        }
        return big;
	}

}
