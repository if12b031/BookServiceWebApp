package at.technikumwien;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import at.technikumwien.generated.BookSOAPWebServiceImplService;
import at.technikumwien.generated.BookSOAPWebService;

public class XmlToBooks {
	public static void main(String[] args) {
	
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Books.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

		    // the simple way
		    // book book = (book) unmarshaller.unmarshal(new File("book.xml"));
		    
		    // the elegant way
		    //Source source = new StreamSource(new File("xml/Books.xml"));
		    //JAXBElement<Book> jaxbElement = unmarshaller.unmarshal(source, List<Book.class>);
			//Book book = jaxbElement.getValue();
		    Books books = (Books) unmarshaller.unmarshal( new File("xml/Books.xml") );
		    
		    books.getBooks().forEach((b)->{
		    	System.out.println(b);
		    });
		    //System.out.println(book);
		    BookSOAPWebServiceImplService service = new BookSOAPWebServiceImplService();
			BookSOAPWebService port = service.getBookSOAPWebServiceImplPort();

			port.insertBooks(books.getBooks());
		} catch (JAXBException e) {
			System.err.println("error: JAXBException while converting XML to Objects.");
			e.printStackTrace();
		}
	}
}
