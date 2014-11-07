package at.technikumwien;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class BookResourceClient {
	public static void main(String[] args) throws Exception {
		Book book = ClientBuilder
			.newClient()
			.target("http://localhost:8080/BookServiceWebApp/resources/books")
			.path("/{bookId}")
			.resolveTemplate("bookId", 1)
			.request(MediaType.APPLICATION_XML)
			.get(Book.class);
		System.out.println(book);
	}
}