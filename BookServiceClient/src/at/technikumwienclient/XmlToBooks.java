package at.technikumwienclient;

import at.technikumwienclient.Books;
import at.technikumwien.generated.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import java.io.File;
import java.util.Scanner;

public class XmlToBooks {
	public static void main(String[] args) throws Exception {
		ClientAuthenticator.setAsDefault("stefan", "write");
		BookSOAPWebServiceImplService service = new BookSOAPWebServiceImplService();
		BookSOAPWebService port = service.getBookSOAPWebServiceImplPort();	
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter Path to Xml: ");
		    String path = scanner.nextLine();
		    System.out.println("...checking...");
			ClientAuthenticator.setAsDefault("stefan", "write");
			JAXBContext jaxbContext = JAXBContext.newInstance(Books.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			//https://www.java.net/forum/topic/glassfish/metro-and-jaxb/yet-another-jaxb-compatability-issue
			Books books = (Books) unmarshaller.unmarshal( new File(path) );
		   
			port.insertBooks(books.book);
		    /*JAXBContext jaxbContext2 = JAXBContext.newInstance(Books.class);
		    Marshaller marshaller = jaxbContext2.createMarshaller();

		    marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
		    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		    marshaller.marshal(books, System.out);
		    marshaller.marshal(books, new File("xml/book.xml"));
		    */
			System.out.println("...succesfully inserted books!");
			scanner.close();
	}
}
