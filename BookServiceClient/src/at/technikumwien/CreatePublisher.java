package at.technikumwien;

import java.util.Scanner;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

public class CreatePublisher {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String name = null;
	    String streetName = null;
	    String streetNumber = null;
	    String postCode = null;
	    String countryCode = null;
	    String confirmation = null;
	    Publisher publisher = null;
	    
	    System.out.print("Enter Publisher name: ");
		name = scanner.nextLine();
		System.out.print("Enter Publisher streetName: ");
		streetName = scanner.nextLine();
		System.out.print("Enter Publisher streetNumber: ");
		streetNumber = scanner.nextLine();
		System.out.print("Enter Publisher postCode: ");
		postCode = scanner.nextLine();
		System.out.print("Enter Publisher countryCode: ");
		countryCode = scanner.nextLine();

		// Create Publisher
		publisher = new Publisher(null, name, postCode, countryCode, streetNumber, streetName);

		// Ask for user confirmation
		System.out.print("Do you want to create a new Publisher" + System.lineSeparator());
		System.out.print("Enter y/n: ");
		confirmation = scanner.nextLine();

		if (confirmation.equals("y")) {
			ClientBuilder.newClient().target("http://localhost:8080/BookServiceWebApp/resources/publishers")
			.request()
			.post(Entity.entity(publisher, MediaType.APPLICATION_JSON), Publisher.class);
			System.out.print("Sending Request..." + System.lineSeparator());
		}

		// Program complete
		System.out.print("Exiting..." + System.lineSeparator());
		scanner.close();
		return;
	}
}