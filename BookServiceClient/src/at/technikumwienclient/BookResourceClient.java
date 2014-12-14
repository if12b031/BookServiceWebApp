package at.technikumwienclient;

import java.io.File;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import at.technikumwien.Publisher;

public class BookResourceClient {
	public static void main(String[] args) throws Exception {
		WebTarget target = ClientBuilder
				.newClient()
				.register(new RequestFilter("georg", "write"))
				.target("http://localhost:8080/BookServiceWebApp/resources/");

//		Book p = target
//				.path("books/{id}")
//				.resolveTemplate("id", 1)
//				.request(MediaType.APPLICATION_XML)
//				.get(Book.class);

		Publisher p = target
				.path("publishers/{id}")
				.resolveTemplate("id", 1)
				.request(MediaType.APPLICATION_XML)
				.get(Publisher.class);
	
		JAXBContext jaxbContext = JAXBContext.newInstance(Publisher.class);
	    Marshaller marshaller = jaxbContext.createMarshaller();

	    marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	    marshaller.marshal(p, System.out);
	    marshaller.marshal(p, new File("xml/publisher_tmp.xml"));
	}
}