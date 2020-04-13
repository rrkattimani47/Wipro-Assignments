/*Given two strings a and b, return a new string, following the rules given below. 
If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b.
Ignore cases where there is no character before or after the word, and a character may be included twice if it is in between two string b's.

Example1)
i/p:abcXY123XYijk,XY
o/p:c13i

Example2)
i/p:XY123XY,XY
o/p:13

Example3)
i/p:XY1XY,XY
o/p:11*/

import java.util.Scanner;
public class Strings11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter a string: ");
		Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println("Enter a word to be eleminated: ");
        String word = in.next();
        
        System.out.println(charJustBeforeAndJustAfterString(str, word));
    }

     static StringBuffer charJustBeforeAndJustAfterString(String str, String word) {
        StringBuffer finalStr = new StringBuffer("");
        int l = str.length();
        for(int i=0; i<l; i++) {
            boolean flag = true;
            int l2 = word.length(), j, k;
            for(j=0, k =i; j<l2 && k <l; j++, k++) {
                if(word.charAt(j) != str.charAt(k)) {
                    flag = false;
                    break;
                }
            }
            if(j == l2 && flag) {
                if(i-1 >= 0)
                    finalStr.append(str.charAt(i-1));
                if(i+l2+1 < l)
                    finalStr.append(str.charAt(i+l2));
                i += (l2);
            }
        }
        return finalStr;
	}

}
