package at.technikumwien;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BookSOAPWebService {
	@WebMethod(operationName="banane")
	public List<Book> getAllBooks();
}