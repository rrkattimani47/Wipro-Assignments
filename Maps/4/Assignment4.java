/*Create a Collection “ContactList” using HashMap to store name and phone number of contacts added. The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not. 
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.*/

public class Assignment4 {

	public static void main(String[] args) {
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("Cheryl Blossom", 98310983);
		contactsList.addContact("Police", 100);
		contactsList.addContact("Penny Peabody", 98765432);
				
		System.out.println("Police: " + contactsList.doesContactNameExist("Police"));
		System.out.println("98765432: " + contactsList.doesContactNumberExist(98765432));
		
		System.out.println();
		contactsList.listAllContacts();
	}

}
