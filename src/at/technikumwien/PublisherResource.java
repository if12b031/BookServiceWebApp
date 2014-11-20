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

@Path("/publishers")
public class PublisherResource {
	@PersistenceContext
	EntityManager em;
	@Inject
	PublisherService service;
	@Context
	UriInfo ui;

	@GET
	@Path("/{publisherId}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Publisher getPublisher(@PathParam("publisherId") Long publisherId) {
		return service.getPublisher(publisherId);
	}

	@GET
	@Path("/all")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Publisher> getAllPublishers() {
		return service.getAllPublishers();
	}

	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response insertPublisher(Publisher publisher) {
		service.insertPublisher(publisher);
		URI newsURI = ui.getAbsolutePathBuilder()
				.path(publisher.getId().toString())
				.build();
		
		return Response.created(newsURI).build();
	}

	@PUT
	@Path("/{publisherId}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void updatePublisher(@PathParam("publisherId") Long publisherId, Publisher publisher) {
		if (!service.updatePublisher(publisherId, publisher)) {
			throw new WebApplicationException(Status.NOT_FOUND);
		}
	}

	@DELETE
	@Path("/{publisherId}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void deletePublisher(@PathParam("publisherId") Long publisherId) {
		if (!service.deletePublisher(publisherId)) {
			throw new WebApplicationException(Status.NOT_FOUND);
		}
	}
}