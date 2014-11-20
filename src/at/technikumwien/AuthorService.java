package at.technikumwien;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class AuthorService {
	@PersistenceContext
	private EntityManager em;

	public List<Author> getAllAuthors() {
		return em.createNamedQuery("Author.selectAll", Author.class).getResultList();
	}

	public void insertAuthor(Author author) {
		em.persist(author);
	}

	public void insertAuthors(List<Author> authors) {
		em.getTransaction().begin();
		authors.forEach((author) -> em.persist(author));
		em.getTransaction().commit();
	}

	public Author getAuthor(Long id) {
		return em.find(Author.class, id);
	}

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