/*Write a program to create a class named shape. It should contain 2 methods, draw() and erase() that prints “Drawing Shape” and “Erasing Shape” respectively.

For this class, create three sub classes, Circle, Triangle and Square and each class should override the parent class functions - draw () and erase (). 

The draw() method should print “Drawing Circle”, “Drawing Triangle” and “Drawing Square” respectively.
The erase() method should print “Erasing Circle”, “Erasing Triangle” and “Erasing Square” respectively.

Create objects of Circle, Triangle and Square in the following way and observe the polymorphic nature of the class by calling draw() and erase() method using each object.

Shape c=new Circle();
Shape t=new Triangle();
Shape s=new Square();*/

//Shape class is Super class
public class Shape {
	void draw() {
        System.out.println("Drawing shape");
    }

     void erase() {
        System.out.println("Erasing Shape");
    }
}

//Circle is Sub class of shape
public class Circle extends Shape{
	 void draw() {
         System.out.println("Drawing Circle");
     }

      void erase() {
         System.out.println("Erasing Circle");
     }
}

//Square is Subclass of Shape
public class Square extends Shape {
	void draw() {
        System.out.println("Drawing Square");
    }

     void erase() {
        System.out.println("Erasing Square");
    }
}

//Triangle is subclass of Shape
public class Triangle extends Shape {
	void draw() {
        System.out.println("Drawing Triangle");
    }

     void erase() {
        System.out.println("Erasing Triangle");
    }
}

//Geometry is the main class
public class Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

         c.draw(); c.erase();
        t.draw(); t.erase();
        s.draw(); s.erase();

	}

}
