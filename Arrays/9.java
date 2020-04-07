/*Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1*/


package reverseMatrix;
import java.util.Scanner;
public class twoDMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args.length != 4)
			
            System.out.println("Please enter 4 integer numbers");
		
        else {
        	
            int arr[][] = new int[2][2];
           
            for (int i = 0, k = 0; i < 2; i++) {
            
                for (int j = 0; j < 2; j++, k++) {
                	
                    arr[i][j] = Integer.parseInt(args[k]);
                }
            }

            System.out.println("The given array is :");
            //printing array
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            // reversing rows;
            for (int i = 0; i < 2; i++) {
                int tmp = arr[0][i];
                arr[0][i] = arr[1][i];
                arr[1][i] = tmp;
            }

            //reversing columns
            for (int i = 0; i < 2; i++) {
                int tmp = arr[i][0];
                arr[i][0] = arr[i][1];
                arr[i][1] = tmp;
            }

            //printing reverse array
            System.out.println("The reverse of the array is :");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
	}

}
