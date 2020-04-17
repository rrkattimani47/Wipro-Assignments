/*Add the following ideas to the previous hands on: 
Create FourWheeler subpackage under automobile package
Logan class extends com.automobile.Vehicle class
public int speed()
– Returns the current speed of the vehicle.
public int gps() 
– provides facility to control the gps device 

Ford class extends  com.automobile.Vehicle class
public int speed()
– Returns the current speed of the vehicle.
public int tempControl() 
– provides facility to control the air conditioning device which is available in the car
Create objects of the relevant classes and test the various functionalities of the class.*/



//Extenstion of Assignment 3, Use the same package com.automobile
//This is main class 
package com.automobile;
import com.automobile.Ford;
import com.automobile.Logan;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logan logan = new Logan("Renault", "DL23F2222", "Stefan Salvatore", 220, 1);
		logan.getModelName();
		logan.getOwnerName();
		logan.getRegistrationNumber();
		logan.speed();
		System.out.println("Has GPS? " + logan.gps());
		
		System.out.println();
		
		Ford ford = new Ford("Mustang GT", "KA22F4444", "Rashmi Kattimani", 300, 1);
		ford.getModelName();
		ford.getOwnerName();
		ford.getRegistrationNumber();
		ford.speed();
		System.out.println("Has AC? " + ford.tempControl());
		
	}

}
