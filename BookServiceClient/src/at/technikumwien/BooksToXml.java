package at.technikumwien;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class BooksToXml {
	public static void main(String[] args) throws Exception {
		Author a = new Author();
		a.setFirstName("Stefan");
		List<Author> aList = new ArrayList<Author>();
		aList.add(a);
		aList.add(a);
	    Book book = new Book(1L, "12345", "Meins", "Moin",
				"moinmoinmoin", 46, aList,
				new Publisher());
	    
	    Books books = new Books();
	    List<Book> bookList = new ArrayList<Book>();
	    bookList.add(book);
	    bookList.add(book);
	    books.setBooks(bookList);
	    
	    JAXBContext jaxbContext = JAXBContext.newInstance(Books.class);
	    Marshaller marshaller = jaxbContext.createMarshaller();

	    marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	    //marshaller.marshal(books, System.out);
	    marshaller.marshal(books, new File("xml/book.xml"));
	  }
}
