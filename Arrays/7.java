/*Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}*/


package removeDuplicatesInArray;
import java.util.Scanner;
public class duplicates {
	public static int removeDuplicateElements(int a[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (a[i] != a[i+1]){  
                temp[j++] = a[i];  
            }  
         }  
        temp[j++] = a[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            a[i] = temp[i];  
        }  
        return j;  
         
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int arr[] = {10,20,20,30,30,40,50,50};  
         
        
        int num, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        num = s.nextInt();
        int a[] = new int[num];
        System.out.println("Enter all the elements:");
        int length = a.length;
        for(int i = 0; i < num; i++)
        {
            a[i] = s.nextInt();
            
        }
    
         
        length = removeDuplicateElements(a, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
            System.out.print(a[i]+" ");
	
}
}
