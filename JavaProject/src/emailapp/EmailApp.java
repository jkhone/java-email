// Simple company email creation application

package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// Will take first name and last name as parameters to generate a company email
		// Example name
		Email em1 = new Email("Jasper", "Khonesavanh");
		
		// Prints out basic info
		System.out.println(em1.showInfo());
	}

}
