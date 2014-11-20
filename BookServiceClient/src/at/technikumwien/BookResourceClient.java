package at.technikumwien;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class BookResourceClient {
	public static void main(String[] args) throws Exception {
		Publisher author = ClientBuilder
			.newClient()
			.target("http://localhost:8080/BookServiceWebApp/resources/abc")
			.path("/{bookId}")
			.resolveTemplate("bookId", 1)
			.request(MediaType.APPLICATION_XML)
			.get(Publisher.class);
		System.out.println(author);
	}
}