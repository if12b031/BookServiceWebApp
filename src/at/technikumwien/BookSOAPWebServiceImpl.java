package at.technikumwien;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebService;

@WebService(endpointInterface="at.technikumwien.BookSOAPWebService")
public class BookSOAPWebServiceImpl implements BookSOAPWebService {

	@Inject
	private BookService bookService;

	@Override
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@Override
	public List<Author> getAllAuthors() {
		return bookService.getAllAuthors();
	}

	@Override
	public List<Publisher> getAllPublishers() {
		return bookService.getAllPublishers();
	}

	@Override
	public boolean insertBook(Book book) {
		return bookService.insertBook(book);
	}

	@Override
	public boolean insertBooks(List<Book> books) {
		return bookService.insertBooks(books);
	}

	@Override
	public List<Book> searchBook(String title) {
		return bookService.searchBook(title);
	}
	
}
