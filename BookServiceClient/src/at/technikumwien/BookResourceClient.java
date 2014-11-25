package at.technikumwien;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class BookResourceClient {
	public static void main(String[] args) throws Exception {
		WebTarget target = ClientBuilder
				.newClient()
				.register(new RequestFilter("myuser", "topsecret"))
				.target("http://localhost:8080/BookServiceWebApp/resources");

		Publisher publisher = target
			.path("publishers/{id}")
			.resolveTemplate("id", 1)
			.request(MediaType.APPLICATION_XML)
			.get(Publisher.class);
		System.out.println(publisher);
	}
}