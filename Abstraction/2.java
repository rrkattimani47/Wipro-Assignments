/*Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. 

public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment.

Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]*/

//Abstract Class Compartment
abstract public class Compartment {
	 abstract void notice();
}

//FirstClass is subclass of Compartment
public class FirstClass extends Compartment{
	void notice() {
        System.out.println("This is First Class!!");
    }
}

//General Class is Subclass of Compartment 
public class General extends Compartment{
	void notice() {
        System.out.println("This is General Class!!");
    }
}
//Luggage Class is Subclass of Compartment 
public class Luggage extends Compartment {
	void notice() {
        System.out.println("This is Lugguage Compartment!!");
    }
}

//Main Class as TestCompartment
import java.util.Random;
public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment c[] = new Compartment[10];

        //initillizing
       Random rand = new Random();

        for (int i = 0; i < 10; i++) {
           int n = rand.nextInt(4) + 1;
           switch (n) {
           case 1:
               c[i] = new FirstClass();
               break;
           case 2:
               c[i] = new Ladies();
               break;
           case 3:
               c[i] = new General();
               break;
           case 4:
               c[i] = new Luggage();
               break;
           }
       }

        //checking polymophic behaviour
       for (int i = 0; i < 10; i++) {
           c[i].notice();
       }
	}

}
