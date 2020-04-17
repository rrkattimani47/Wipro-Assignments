/*Create a package called test package.
Define a class called foundation inside the test package.
Inside the class, you need to define 4 integer variables:
var1 with private access modifier
var2 with default access modifier
var3 with protected access modifier
var4 with public access modifier

Import this class and packages in another class. 
Try to access all 4 variables of the foundation class and see what variables are accessible and what are not accessible.*/

//Create a package called testpackage
package testpackage;

public class Foundation {
	private int Var1;
	int Var2;
	protected int Var3;
	public int Var4;
}


//Create a main class
package testpackage;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foundation foundation = new Foundation();

		foundation.Var4 = 5;
		
		System.out.println(foundation.Var4);
	}

}
