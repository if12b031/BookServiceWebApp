package at.technikumwien;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Element;

import at.technikumwien.generated.Book;
import at.technikumwien.generated.BookSOAPWebServiceImplService;
import at.technikumwien.generated.BookSOAPWebService;

public class XmlToBooks {
	public static void main(String[] args) {
	
		JAXBContext jaxbContext;
		try {
			Scanner scanner = new Scanner(System.in);;
			System.out.print("Enter Path to Xml: ");
		    String path = scanner.nextLine();
		    System.out.println("...checking...");
			ClientAuthenticator.setAsDefault("stefan", "write");
			jaxbContext = JAXBContext.newInstance(Books.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Books books = (Books) unmarshaller.unmarshal( new File(path) );
			
		    List<Book> bookList = new ArrayList<Book>();
		    books.getBooks().forEach((b)->{
		    	//adapt book
		    	at.technikumwien.generated.Book bookTemp = new at.technikumwien.generated.Book();
		    	bookTemp.setDescription(b.getDescription());
		    	bookTemp.setId(b.getId());
		    	bookTemp.setIsbn(b.getIsbn());
		    	bookTemp.setPages(b.getPages());
		    	bookTemp.setSubtitle(b.getSubtitle());
		    	bookTemp.setTitle(b.getTitle());
		    	//adapt Publisher
		    	at.technikumwien.generated.Publisher publisherTemp = new at.technikumwien.generated.Publisher();
		    	publisherTemp.setId(b.getPublisher().getId());
		    	publisherTemp.setCountrycode(b.getPublisher().getCountrycode());
		    	publisherTemp.setName(b.getPublisher().getName());
		    	publisherTemp.setPostcode(b.getPublisher().getPostcode());
		    	publisherTemp.setStreetName(b.getPublisher().getStreetName());
		    	publisherTemp.setStreetNumber(b.getPublisher().getStreetNumber());
		    	bookTemp.setPublisher(publisherTemp);
		    	//adapt authors
		    	List<at.technikumwien.generated.Author> authorList = new ArrayList<at.technikumwien.generated.Author>();
		    	System.out.println(b.getAuthors());
		    	System.out.println(b.getPublisher());
		    	b.getAuthors().forEach((a)->{
		    		at.technikumwien.generated.Author authorTemp = new at.technikumwien.generated.Author();
		    		authorTemp.setBirthday(a.getBirthday());
		    		authorTemp.setFirstName(a.getFirstName());
		    		authorTemp.setId(a.getId());
		    		authorTemp.setLastName(a.getLastName());
		    		authorTemp.setNationality(a.getNationality());
		    		authorTemp.setTitle(a.getTitle());
		    		authorList.add(authorTemp);
		    		
		    	});
		    	bookTemp.setAuthors(authorList);
		    	bookList.add(bookTemp);
		    });
		    books.getBooks().forEach((b)->{
		    	//System.out.println("Book: " + b);
		    	/*
		    	b.getAuthors().forEach((a)->{
		    		System.out.println("Author: Firstname: " + a.getFirstName() + " & Lastname: " + a.getLastName());
		    	});
		    	System.out.println("Publisher: " + b.getPublisher());
		    	*/
		    });
		    BookSOAPWebServiceImplService service = new BookSOAPWebServiceImplService();
			BookSOAPWebService port = service.getBookSOAPWebServiceImplPort();
			//port.insertBooks(bookList);
			System.out.println("...succesfully inserted books!");
			scanner.close();
		} catch (JAXBException e) {
			System.err.println("error: JAXBException while converting XML to Objects.");
			e.printStackTrace();
		}
	}
}
