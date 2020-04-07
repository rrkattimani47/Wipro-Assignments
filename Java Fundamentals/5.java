/*Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.*/

package order;

public class abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char item1='3';
        char item2='e';
        if (item1>item2)
            System.out.println(item2+" , "+item1);
        
        else
            System.out.println(item1+" , "+item2);
        
        if((item1>96&&item1<123)||(item1>64&&item1<91))
            System.out.println("Alphabet");
        else if(item1>47&&item1<58)
            System.out.println("Digit");
        else
            System.out.println("Special Character");
	}

}
