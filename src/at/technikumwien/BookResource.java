package at.technikumwien;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

@Path("/books")
public class BookResource {
	@PersistenceContext
	EntityManager em;
	@Inject
	BookService service;
	@Context
	UriInfo ui;

	@GET
	@Path("/{bookId}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Book getBook(@PathParam("bookId") Long bookId) {
		return service.getBook(bookId);
	}
	
	@GET
	@Path("/all")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Book> getAllBooks() {
		return service.getAllBooks();
	}

	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response insertBook(Book book) {
		service.insertBook(book);
		URI newsURI = ui.getAbsolutePathBuilder()
				.path(book.getId().toString())
				.build();
		
		return Response.created(newsURI).build();
	}

	@PUT
	@Path("/{bookId}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void updateBook(@PathParam("bookId") Long bookId, Book book) {
		if (!service.updateBook(bookId, book)) {
			throw new WebApplicationException(Status.NOT_FOUND);
		}
	}

	@DELETE
	@Path("/{bookId}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void deleteBook(@PathParam("bookId") Long bookId) {
		if (!service.deleteBook(bookId)) {
			throw new WebApplicationException(Status.NOT_FOUND);
		}
	}
}