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
public class AuthorService {
	@PersistenceContext
	private EntityManager em;
	
	@RolesAllowed({"BSRead","BSWrite"})
	public List<Author> getAllAuthors() {
		return em.createNamedQuery("Author.selectAll", Author.class).getResultList();
	}

	@RolesAllowed("BSWrite")
	public void insertAuthor(Author author) {
		em.persist(author);
	}

	@RolesAllowed("BSWrite")
	public void insertAuthors(List<Author> authors) {
		em.getTransaction().begin();
		authors.forEach((author) -> em.persist(author));
		em.getTransaction().commit();
	}

	@RolesAllowed({"BSRead","BSWrite"})
	public Author getAuthor(Long id) {
		return em.find(Author.class, id);
	}

	@RolesAllowed("BSWrite")
	public boolean updateAuthor(Long id, Author newAuthor) {
		Author author = em.find(Author.class, id);
		if (author == null) {
			return false;
		} else {
			author.setTitle(newAuthor.getTitle());
			author.setFirstName(newAuthor.getFirstName());
			author.setLastName(newAuthor.getLastName());
			author.setBirthday(newAuthor.getBirthday());
			return true;
		}
	}
	@RolesAllowed("BSWrite")
	public boolean deleteAuthor(Long authorId) {
		Author author = em.find(Author.class, authorId);
		if (author == null) {
			return false;
		} else {
			em.remove(author);
			return true;
		}
	}
}