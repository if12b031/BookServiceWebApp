package at.technikumwien;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BookSOAPWebService {

	@WebMethod(operationName="getAllBooks")
	public List<Book> getAllBooks();

	@WebMethod(operationName="getAllAuthors")
	public List<Author> getAllAuthors();

	@WebMethod(operationName="getAllPublishers")
	public List<Publisher> getAllPublishers();

	@WebMethod(operationName="insertBook")
	public boolean insertBook(Book book);

	@WebMethod(operationName="insertBooks")
	public boolean insertBooks(List<Book> books);

	@WebMethod(operationName="searchBook")
	public List<Book> searchBook(String title);
}