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

@Path("/authors")
public class AuthorResource {
	@PersistenceContext
	EntityManager em;
	@Inject
	AuthorService service;
	@Context
	UriInfo ui;

	@GET
	@Path("/{authorId}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Author getAuthor(@PathParam("authorId") Long authorId) {
		return service.getAuthor(authorId);
	}
	
	@GET
	@Path("/all")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Author> getAllAuthors() {
		return service.getAllAuthors();
	}

	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response insertAuthor(Author author) {
		service.insertAuthor(author);
		URI newsURI = ui.getAbsolutePathBuilder()
				.path(author.getId().toString())
				.build();
		
		return Response.created(newsURI).build();
	}

	@PUT
	@Path("/{authorId}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void updateAuthor(@PathParam("authorId") Long authorId, Author author) {
		if (!service.updateAuthor(authorId, author)) {
			throw new WebApplicationException(Status.NOT_FOUND);
		}
	}

	@DELETE
	@Path("/{authorId}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void deleteAuthor(@PathParam("authorId") Long authorId) {
		if (!service.deleteAuthor(authorId)) {
			throw new WebApplicationException(Status.NOT_FOUND);
		}
	}
}