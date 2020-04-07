//Initialize an integer array with ascii values and print the corresponding character values in a single row.

package asciiToString;

public class asciiTostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num[] = {65, 120, 98, 75, 115};
	        String str =null;
	        for(int i: num){
	            str = Character.toString((char)i);
	            System.out.print("   "+str);
	        }
	}

}
