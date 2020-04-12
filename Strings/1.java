//Write a Program to check whether a given String is Palindrome or not.

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String s = "";
        System.out.print("Enter a string: ");
        s = in.nextLine();

         if (isPalindrome(s))
            System.out.print("String is Pallindrome!");
        else
            System.out.print("String is not Pallindrome!");
    }

     static boolean isPalindrome(String s) {
        int l = s.length();
        for (int i = 0; i < l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1))
                return false;
        }
        return true;
	}

}
