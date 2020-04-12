/*Create  a base class Fruit with name ,taste and size as its attributes. 

Create a method called eat() which describes the name of the fruit and its taste. 

Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.*/

//Fruit Class
import java.awt.SystemColor;
public class Fruit {
	String name, taste;
    int size;

     Fruit() {
        name = "";
        taste = "";
        size = 0;
    }

     void eat() {
        System.out.println(name + " : " + taste);
    }
}

//Apple class is subclass of Fruit
public class Apple extends Fruit {
	Apple() {
        name = "Apple";
        size = 20;
    }
    void eat() {
        System.out.println(name + " : " + "Sweet and Crunchy");
        System.out.println("Size of fruit in diameters "+size + " : " + "cm");
        
    }
}

//Orange Class is subclass of Fruit
public class Orange extends Fruit{
	Orange() {
        name = "Orange";
        size = 35;
    }
    void eat() {
        System.out.println(name + " : " + "Sweet & Sour");
        System.out.println("Size of fruit in diameters "+size + " : " + "cm");
    }
}
//Taste class is main class
public class Taste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple();
        apple.eat();
        Orange orange = new Orange();
        orange.eat();
	}

}

