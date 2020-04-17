/*Create a class called compartment which represents the ship compartments with attributes like height, width and breadth. 

Take care it should not conflict with the compartment class you have created in Abstract class exercise 2.

To avoid conflict create this class in a new package called com.wipro.automobile.ship */

//Comaprtment Class
package com.wipro.automobile.ship;

public class Compartment {
	private double height;
	private double width;
	private double breadth;
	
	public Compartment(double height, double width, double breadth) {
		super();
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Compartment : \nheight=" + height + ", \nwidth=" + width + ", \nbreadth=" + breadth +"";
	}

}
----------------------------------------------------------------------------------------------------------------------------
//Main Class

package com.wipro.automobile.ship;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Compartment compartment = new Compartment(10.5, 4.5, 8.2);
		
		System.out.println(compartment);
	}

}
