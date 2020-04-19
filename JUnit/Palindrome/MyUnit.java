/* i) Create the following class and implement the method to check whether the given string is a palindrome and return the result.

Class Name : Demo2
Method : palindromeCheck(String):boolean

(Hint: A String is palindrome,  If the reversed string is equal to the actual string. Ex: madam, mom, dad, malayalam )
ii) Create a Junit test class to test the above class.*/

public class MyUnit {
	public boolean palindromeCheck(String input1) {
		input1 = input1.toLowerCase();
		int digitCount = input1.length();
		boolean isPalindrome = true;
		
		int range = digitCount / 2;
		if (digitCount % 2 == 0) range--;
		
		for (int i = 0; i <= range; i++) {
			if (input1.charAt(i) != input1.charAt(digitCount - i - 1)) isPalindrome = false;
		}
		
		return isPalindrome;
	}
}

//After saving this rigth click on project- new- Junit test case- add function in JUnit test to test
//Then JUnit class- rigth click - Debug as- JUnit (Use JUnit4) to run
//Left TaskBar wwith green Horizonal line appears
