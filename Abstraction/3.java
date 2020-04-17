/*Create an abstract class Instrument which is having the abstract function play. 

Create three more sub classes from Instrument which is Piano, Flute, Guitar. Override the play method inside all three classes printing a message 
“Piano is playing  tan tan tan tan  ”  for Piano class
“Flute is playing  toot toot toot toot”  for Flute class
“Guitar is playing  tin  tin  tin ”  for Guitar class 

Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of  play method.
Use the instanceof operator to print which object is stored at which index of instrument array.*/

//Abstract Class Instrument
abstract public class Instrument {
	abstract void play();
}

//Subclass Piano of Class Instrument 
public class Piano extends Instrument{
	void play() {
        System.out.println("Piano is playing  tan tan tan tan");
    }
}
//Subclass Flute of Class Instrument 
public class Flute extends Instrument {
	void play() {
        System.out.println("Flute is playing  toot toot toot toot");
    }
}
//Subclass Guitar of Class Instrument 
public class Guitar extends Instrument{
	void play() {
        System.out.println("Guitar is playing  tin  tin  tin");
    }
}

//Main Class
import java.util.Random;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Instrument[] instruments = new Instrument[10];

         Random rand = new Random();

         for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(3) + 1;
            switch (n) {
            case 1:
                instruments[i] = new Piano();
                break;
            case 2:
                instruments[i] = new Flute();
                break;
            case 3:
                instruments[i] = new Guitar();
                break;
            }
        }

         // checking polymorphic behaviour
        for (int i = 0; i < 10; i++) {
            if(instruments[i] instanceof Piano)
                System.out.print("Instrument " + i + " is of type Piano, ");
            if(instruments[i] instanceof Flute)
                System.out.print("Instrument " + i + " is of type Flute, ");
            if(instruments[i] instanceof Guitar)
                System.out.print("Instrument "+ i + " is of type Guitar, ");
            instruments[i].play();
        }
	}

}
