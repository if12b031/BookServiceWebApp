package at.technikumwien;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BookSOAPWebService {
	@WebMethod(operationName="allBooks")
	public List<Book> getAllBooks();

	@WebMethod(operationName="allAuthors")
	public List<Author> getAllAuthors();

	@WebMethod(operationName="allPublishers")
	public List<Publisher> getAllPublishers();
}