package at.technikumwien;

import java.io.File;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class BookResourceClient {
	public static void main(String[] args) throws Exception {
		WebTarget target = ClientBuilder
				.newClient()
				.register(new RequestFilter("georg", "write"))
				.target("http://localhost:8080/BookServiceWebApp/resources/");

		Book b = target
				.path("books/{id}")
				.resolveTemplate("id", 1)
				.request(MediaType.APPLICATION_XML)
				.get(Book.class);
		JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
	    Marshaller marshaller = jaxbContext.createMarshaller();

	    marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	    marshaller.marshal(b, System.out);
	    marshaller.marshal(b, new File("xml/book_tmp.xml"));
	}
}