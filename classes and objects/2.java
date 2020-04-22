/*Create a new class called Calculator with the following methods: 
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.*/


	class Calci {
    public static int powerInt(int num, int power) {
        int res =(int)Math.pow(num,power);
        return res;
    }
    public static double powerDouble(double num,int power) {
    	double res =(double)Math.pow(num,power);
        return res;
    }
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Value of 2^10 : " + Calci.powerInt(2, 10));
        System.out.println("Value of 3.14^10 : " + Calci.powerDouble(3.14, 10));
	}

}

