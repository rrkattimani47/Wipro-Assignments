/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. 
Create an object of the Box class and test the functionalities.*/

package hmm;

class box{
	
	double width, height, depth;
    box(double w, double h, double d) {
        height = h;
        width = w;
        depth = d;
    }

     public double volume() {
        return width*height*depth;
    }
}

public class volumeBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		box b = new box(10, 20, 30);
        System.out.println("Volume of the box is: " + b.volume());
	}

}
