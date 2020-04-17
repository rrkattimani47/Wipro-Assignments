/* Create a class called GeneralBank that acts as base class for all banks. This class has getSavingsInterestRate and getFixedDepositInterestRate methods, which returns the savings account interest rate and fixed deposit account interest rate that the specific bank gives. Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.

Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods from the base class. The following are the interest rates of these banks.
ICICIBank - Savings 4% Fixed 8.5% and 
KotMBank - Savings 6% Fixed 9%.

Create a main method to test the above classes and their methods. Try one by one and observe your findings

a) ICICIBank i=new ICICIBank();

b) KotMBank k=new KotMBank();

c) GeneralBank g=new KotMBank();

d) GeneralBank g=new ICICIBank();*/

//Create Abstract Class
abstract public class GeneralBank {
	abstract double getSavingInterestRate();
    abstract double getFixedInterestRate();
}

//Create a subclass ICICIBank from abstract class General Bank
public class ICICIBank extends GeneralBank{
	double getSavingInterestRate() {
        return 4;
    }
    double getFixedInterestRate() {
        return 8.5;
    }
}
//Create a subclass KotMBank from abstract class General Bank

public class KotMBank extends GeneralBank{
	double getSavingInterestRate() {
        return 6;
    }
    double getFixedInterestRate() {
        return 9;
    }
}

//Main class
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICIBank iciciBank = new ICICIBank();
        KotMBank kotMBank = new KotMBank();
        GeneralBank gBank1 =  new ICICIBank();
        GeneralBank gBank2 = new KotMBank();

         // observing
        System.out.println("ICICI BANK: " + 
                            "Fixed Rate = " + iciciBank.getFixedInterestRate() + "%, " + 
                            "Saving Rate = " + iciciBank.getSavingInterestRate() + "%");

         System.out.println("KOTAK MAHINDRA BANK: " + 
                            "Fixed Rate = " + kotMBank.getFixedInterestRate() + "%, " + 
                            "Saving Rate = " + kotMBank.getSavingInterestRate() + "%");

         System.out.println("GENERAL BANK1: " + 
                            "Fixed Rate = " + gBank1.getFixedInterestRate() + "%, " + 
                            "Saving Rate = " + gBank1.getSavingInterestRate() + "%");

         System.out.println("GENERAL BANK2: " + 
                            "Fixed Rate = " + gBank2.getFixedInterestRate() + "%, " + 
                            "Saving Rate = " + gBank2.getSavingInterestRate() + "%");
	}

}




