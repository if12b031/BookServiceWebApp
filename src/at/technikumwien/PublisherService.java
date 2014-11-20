package at.technikumwien;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class PublisherService {
	@PersistenceContext
	private EntityManager em;

	public List<Publisher> getAllPublishers() {
		return em.createNamedQuery("Publisher.selectAll", Publisher.class).getResultList();
	}

	public void insertPublisher(Publisher publisher) {
		em.persist(publisher);
	}

	public void insertPublishers(List<Publisher> publishers) {
		em.getTransaction().begin();
		publishers.forEach((publisher) -> em.persist(publisher));
		em.getTransaction().commit();
	}

	public Publisher getPublisher(Long id) {
		return em.find(Publisher.class, id);
	}

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