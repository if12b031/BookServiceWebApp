package at.technikumwien;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.ejb3.annotation.SecurityDomain;

@Stateless
@LocalBean
@SecurityDomain("BookServiceSD")
public class PublisherService {
	@PersistenceContext
	private EntityManager em;
	
	@RolesAllowed({"BSRead","BSWrite"})
	public List<Publisher> getAllPublishers() {
		return em.createNamedQuery("Publisher.selectAll", Publisher.class).getResultList();
	}

	@RolesAllowed("BSWrite")
	public void insertPublisher(Publisher publisher) {
		em.persist(publisher);
	}
	@RolesAllowed("BSWrite")
	public void insertPublishers(List<Publisher> publishers) {
		em.getTransaction().begin();
		publishers.forEach((publisher) -> em.persist(publisher));
		em.getTransaction().commit();
	}
	@RolesAllowed({"BSRead","BSWrite"})
	public Publisher getPublisher(Long id) {
		return em.find(Publisher.class, id);
	}
	@RolesAllowed("BSWrite")
	public boolean updatePublisher(Long id, Publisher newPublisher) {
		Publisher publisher = em.find(Publisher.class, id);
		if (publisher == null) {
			return false;
		} else {
			publisher.setName(newPublisher.getName());
			publisher.setPostcode(newPublisher.getPostcode());
			publisher.setCountrycode(newPublisher.getCountrycode());
			publisher.setStreetName(newPublisher.getStreetName());
			publisher.setStreetNumber(newPublisher.getStreetNumber());
			return true;
		}
	}

	@RolesAllowed("BSWrite")
	public boolean deletePublisher(Long publisherId) {
		Publisher publisher = em.find(Publisher.class, publisherId);
		if (publisher == null) {
			return false;
		} else {
			em.remove(publisher);
			return true;
		}
	}
}