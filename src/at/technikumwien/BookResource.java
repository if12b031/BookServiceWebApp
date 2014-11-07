package at.technikumwien;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/books")
public class BookResource {
	@PersistenceContext
	EntityManager em;
	@Inject
	BookService bookService;
	
	@GET
	@Path("/{bookId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getBooksAsString(@PathParam("bookId") Long bookId) {
		Book book = em.find(Book.class, bookId);
		return (book != null ? book.toString() : null);
	}
	
	@GET
	@Path("/{bookId}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Book getNewsAsJSONXML(@PathParam("bookId") Long bookId) {
		return em.find(Book.class, bookId);
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
}