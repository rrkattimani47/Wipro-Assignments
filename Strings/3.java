/*Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.

Example1)
i/p:Wipro
o/p:WiWiWiWiWi*/


import java.util.Scanner;
public class CopyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
         String str = in.nextLine();
         System.out.println(nCopyString(str));
     }

      static String nCopyString(String s) {
         int n = s.length();
         String base = s.substring(0, 2);

          String str = "";

          for(int i=0; i<n; i++)
             str += base;

          return str;
	}

}
