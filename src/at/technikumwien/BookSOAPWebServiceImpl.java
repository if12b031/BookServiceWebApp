package at.technikumwien;

import java.util.List;
import javax.inject.Inject;

public class BookSOAPWebServiceImpl implements BookSOAPWebService {

	@Inject
	private BookService bookService;

	@Override
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
}
