package at.technikumwien;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface BookSOAPWebService {
	@WebMethod(operationName="getAllBooks")
	public List<Book> getAllBooks();

	@WebMethod(operationName="allAuthors")
	public List<Author> getAllAuthors();

	@WebMethod(operationName="allPublishers")
	public List<Publisher> getAllPublishers();

	@WebMethod(operationName="insertBook")
	public boolean insertBook(@WebParam(name="book") Book b);

	@WebMethod(operationName="insertBooks")
	public boolean insertBooks(@WebParam(name="book") List<Book> b);

	@WebMethod(operationName="searchBook")
	public List<Book> searchBook(@WebParam(name="bookTitle") String title);
}