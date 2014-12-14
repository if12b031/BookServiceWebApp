package at.technikumwienclient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import at.technikumwien.Author;

public class CreateAuthor {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String title = null;
	    String firstName = null;
	    String lastName = null;
	    String nationality = null;
	    String birthday = null;
	    String confirmation = null;
	    SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
	    Author author = null;

	    System.out.print("Enter Author title: ");
	    title = scanner.nextLine();
		System.out.print("Enter Author firstName: ");
		firstName = scanner.nextLine();
		System.out.print("Enter Author lastName: ");
		lastName = scanner.nextLine();
		System.out.print("Enter Author nationality: ");
		nationality = scanner.nextLine();
		System.out.print("Enter Author birthday: ");
		birthday = scanner.nextLine();

		// Create Author
		try {
			author = new Author(null, title, firstName, lastName, nationality, format.parse(birthday));
		} catch (ParseException e) {
			System.out.print("Failed to parse birthday..." + System.lineSeparator());
			System.out.print("Exiting..." + System.lineSeparator());
			scanner.close();
			System.exit(1);
		}

		// Ask for user confirmation
		System.out.print("Do you want to create a new Publisher" + System.lineSeparator());
		System.out.print("Enter y/n: ");
		confirmation = scanner.nextLine();

		if (confirmation.equals("y")) {
			System.out.print("Sending Request..." + System.lineSeparator());
			WebTarget target = ClientBuilder
					.newClient()
					.register(new RequestFilter("georg", "write"))
					.target("http://localhost:8080/BookServiceWebApp/resources/authors");
			target
				.request()
				.post(Entity.entity(author, MediaType.APPLICATION_JSON), Author.class);
		}

		// Program complete
		System.out.print("Exiting..." + System.lineSeparator());
		scanner.close();
		return;
	}
}