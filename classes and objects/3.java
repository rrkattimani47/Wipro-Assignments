/*Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),width(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.*/

class Patients {
     private String name;
     double height, weight;

      Patients(double h, double w) {
         height = h;
         weight = w;
     }

      double BMI() {
         double bmi = (weight / (height * height) ) * 703;
         return bmi;
     }
 }





public class Patient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patients p = new Patients(66.8, 112.436);
        System.out.println("BMI of Patient is: " + p.BMI());
	}

}
