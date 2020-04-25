// Implement the assignment 1 using HashTable


import java.util.HashMap;
import java.util.Hashtable;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryMap countryMap = new CountryMap();

		countryMap.saveCountryCapital("India", "Delhi");
		countryMap.saveCountryCapital("Japan", "Tokyo");
		countryMap.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		System.out.println(countryMap.toArrayList());
		
		Hashtable<String, String> M2 = countryMap.swapKyeValue();
		System.out.println(M2);
	}

}
