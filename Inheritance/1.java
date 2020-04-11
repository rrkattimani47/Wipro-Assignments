/*Create a class named ‘Animal’ which includes methods like eat() and sleep().

Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().

Create an instance of Animal class and invoke the eat and sleep methods using this object.

Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.*/
//Create a class Animal 
public class Animal {

	public void eat() {
        System.out.println("Animal is eating...Nom..nom");
    }

     public void sleep() {
        System.out.println("Animal is sleeping Zzz..zzZ..!!");
    }
}

//Create one more class which has main in that 
public class Bird extends Animal {
	 @Override
     public void eat() {
         System.out.println("Bird is eating.....nom...Nom!!");
     }

      @Override
     public void sleep() {
         System.out.println("Bird is sleeping...ZzzZZ!!");
     }

      public void fly() {
         System.out.println("Bird is Flying...yippiee");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
        a.eat();
        a.sleep();

         Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
	}

}
