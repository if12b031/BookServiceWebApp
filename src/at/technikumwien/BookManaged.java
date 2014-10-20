package at.technikumwien;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ApplicationScoped
@Named("appBook")
public class BookManaged {
	@Inject
	BookService service;

	public List<Book> getAllBooks() {
		return service.getAllBooks();
	}

}
