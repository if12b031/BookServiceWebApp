package at.technikumwien;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

@Stateless
@LocalBean
public class BookService {
	@PersistenceContext
	private EntityManager em;
	
	public List<Book> getAllBooks(){
		/* Insert an Author */
		Author author = new Author(null, "Title", "Name", "Lastname", "AT", 'm', new Date());
		em.persist(author);
		/* Insert a Publisher */
		Publisher publisher = new Publisher(null, "Publisher", "1220", "AT", "Street", "1");
		em.persist(publisher);
		/* Insert a Book*/
		List<Author> authors = new ArrayList<Author>();
		authors.add( em. find(Author.class, 1L)); // find Author with ID 1
		Book book = new Book(null, "ISBN", "Booktitle", "BookSubtitle", "Description", 100, authors, em.find(Publisher.class, 1L));
		insertBook(book);

		return em.createNamedQuery("Book.selectAll", Book.class).getResultList();
	}

	public List<Author> getAllAuthors() {
		return em.createNamedQuery("Author.selectAll", Author.class).getResultList();
	}

	public List<Publisher> getAllPublishers() {
		return em.createNamedQuery("Publisher.selectAll", Publisher.class).getResultList();
	}

	public boolean insertBook(Book book) {
		if (!checkInsertBook(book)) {
			return false;
		} else {
			em.persist(book);
			return true;
		}
	}

	public boolean insertBooks(List<Book> books) {
		for (int i = 0; i < books.size(); i++) {
			if (!checkInsertBook(books.get(i))) {
				return false;
			}
		}
		em.getTransaction().begin();
		books.forEach((book) -> em.persist(book));
		em.getTransaction().commit();
		return true;
	}

	public List<Book> searchBook(String title) {
		TypedQuery<Book> q = em.createQuery("SELECT b FROM Book b WHERE b.title LIKE ?1",
				Book.class);
		q.setParameter(1, title);
		return q.getResultList(); 
	}

	private boolean checkInsertBook(Book book){
		List<Author> authors =  book.getAuthors();
		Publisher publisher = book.getPublisher();
		long countPublisher = 0;
		long countFirstName = 0;
		long countLastName = 0;

		// Check if Publisher exists
		Query q = em.createQuery("SELECT COUNT(p.name) FROM Publisher p WHERE p.name = ?1");
		q.setParameter(1, publisher.getName());
		countPublisher = (Long) q.getSingleResult();
		if (countPublisher < 1) {
			return false;
		}
		// Check if Author exists
		for (int i = 0; i < authors.size(); i++) {
			Author author = authors.get(i);
			// Search for firstName
			q = em.createQuery("SELECT COUNT(a.firstName) FROM Author a WHERE a.firstName = ?1");
			q.setParameter(1, author.getFirstName());
			countFirstName = (Long) q.getSingleResult();
			// Search for lastName
			q = em.createQuery("SELECT COUNT(a.lastName) FROM Author a WHERE a.lastName = ?1");
			q.setParameter(1, author.getLastName());
			countLastName = (Long) q.getSingleResult();

			if (countFirstName < 1 || countLastName < 1) {
				return false;
			}
		}
		return true;
	}
}