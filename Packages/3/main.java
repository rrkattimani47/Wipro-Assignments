/*Create a package called com.automobile. Define an abstract class called Vehicle. 
Vehicle class has the following abstract methods: 
public String getModelName() 
public String getRegistrationNumber() 
public String getOwnerName() 

Create twowheeler subpackage under automobile package
Hero  class extends  automobile.vehicle class with the following methods
public int getSpeed() 
– returns the current speed of the vehicle.
public void radio() 
– provides facility to control the radio device 

Honda class extends com.automobile.vehicle class with the following methods
public int getSpeed()
– Returns the current speed of the vehicle.
public void cdplayer() 
– provides facility to control the cd player device which is available in the car.

Create a test class to test the methods available in all these child class.*/

//Main Class
import com.automobile.Honda;
import com.automobile.twowheeler.Hero;
public class Assignment3 {
	public static void main(String[] args) {
		Hero hero = new Hero("Activa 125", "KA22C5947", "Rashmi Kattimani", 85);
		hero.getModelName();
		hero.getOwnerName();
		hero.getRegistrationNumber();
		hero.getSpeed();
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda City", "KA23G6047", "Jughead Jones", 110);
		honda.getModelName();
		honda.getOwnerName();
		honda.getRegistrationNumber();
		honda.getSpeed();
		honda.cdplayer();

}
}
