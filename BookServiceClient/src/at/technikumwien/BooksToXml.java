package at.technikumwien;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class BooksToXml {
	public static void main(String[] args) throws Exception {
	    Book book = new Book(1L, "12345", "Meins", "Moin",
				"moinmoinmoin", 46, new <Author>ArrayList(),
				new Publisher());
	    
	    JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
	    Marshaller marshaller = jaxbContext.createMarshaller();

	    marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	    marshaller.marshal(book, System.out);
	    marshaller.marshal(book, new File("xml/book.xml"));
	  }
}
