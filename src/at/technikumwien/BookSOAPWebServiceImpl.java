package at.technikumwien;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebService;

@WebService(endpointInterface="at.technikumwien.BookSOAPWebService")
public class BookSOAPWebServiceImpl implements BookSOAPWebService {

	@Inject
	private BookService bookService;
	@Inject
	private AuthorService authorService;
	@Inject
	private PublisherService publisherService;

	@Override
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@Override
	public List<Author> getAllAuthors() {
		return authorService.getAllAuthors();
	}

	@Override
	public List<Publisher> getAllPublishers() {
		return publisherService.getAllPublishers();
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