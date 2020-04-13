/*Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *

Example1)
i/p:ab*cd
o/p:ad*/

import java.util.Scanner;
public class Strings8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string with * in middle: ");
		Scanner in = new Scanner(System.in);
        StringBuffer str = new StringBuffer(in.nextLine());
        int l = str.length();
        boolean valid[] = new boolean[l];

         for(int i=0; i<l; i++) valid[i] = true;

         for(int i=0; i<l; i++) {
            if(str.charAt(i) == '*') {
                valid[i] = false;
                if(i-1 >= 0)
                    valid[i-1] = false;
                if(i+1 < l)
                    valid[i+1] = false;
            }
        }

         StringBuffer newStr = new StringBuffer("");
        for(int i=0; i<l; i++) {
            if(valid[i]) {
                newStr.append(str.charAt(i));
            }
        }
        System.out.println(newStr);
	}

}
