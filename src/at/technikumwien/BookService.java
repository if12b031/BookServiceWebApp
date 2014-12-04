package at.technikumwien;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.jboss.ejb3.annotation.SecurityDomain;

@Stateless
@LocalBean
@SecurityDomain("BookServiceSD")
public class BookService {
	@PersistenceContext
	private EntityManager em;

	@RolesAllowed({"BSRead","BSWrite"})
	public List<Book> getAllBooks() {
		return em.createNamedQuery("Book.selectAll", Book.class).getResultList();
	}

	@RolesAllowed({"BSWrite"})
	public boolean insertBook(Book book) {
		if (!checkInsertBook(book)) {
			return false;
		} else {
			em.persist(book);
			return true;
		}
	}

	@RolesAllowed({"BSWrite"})
	public boolean insertBooks(List<Book> books) {
		for (int i = 0; i < books.size(); i++) {
			if (!checkInsertBook(books.get(i))) {
				return false;
			}
		}
		books.forEach((book) -> em.persist(book));
		return true;
	}

	@RolesAllowed({"BSRead","BSWrite"})
	public List<Book> searchBook(String title) {
		TypedQuery<Book> q = em.createQuery("SELECT b FROM Book b WHERE b.title LIKE ?1",
				Book.class);
		q.setParameter(1, "%" + title + "%");
		return q.getResultList();
	}

	@RolesAllowed({"BSRead","BSWrite"})
	public Book getBook(Long id) {
		return em.find(Book.class, id);
	}

	@RolesAllowed({"BSWrite"})
	public boolean updateBook(Long id, Book newBook) {
		Book book = em.find(Book.class, id);
		if (book == null) {
			return false;
		} else {
			book.setIsbn(newBook.getIsbn());
			book.setTitle(newBook.getTitle());
			book.setSubtitle(newBook.getSubtitle());
			book.setDescription(newBook.getDescription());
			book.setPages(newBook.getPages());
			book.setAuthors(newBook.getAuthors());
			book.setPublisher(newBook.getPublisher());
			return true;
		}
	}

	@RolesAllowed({"BSWrite"})
	public boolean deleteBook(Long bookId) {
		Book book = em.find(Book.class, bookId);
		if (book == null) {
			return false;
		} else {
			em.remove(book);
			return true;
		}
	}
	
	private boolean checkInsertBook(Book book){
		List<Author> authors =  book.getAuthors();
		Publisher publisher = book.getPublisher();
		long countPublisher = 0;
		long countAuthor = 0;

		// Check if Publisher exists
		Query q = em.createQuery("SELECT COUNT(*) FROM Publisher p WHERE p.name = ?1 AND p.streetname = ?2 AND p.streetnumber = ?3");
		q.setParameter(1, publisher.getName());
		q.setParameter(2, publisher.getStreetName());
		q.setParameter(3, publisher.getStreetNumber());
		countPublisher = (Long) q.getSingleResult();
		if (countPublisher < 1) {
			return false;
		}
		// Check if Author exists
		for (int i = 0; i < authors.size(); i++) {
			Author author = authors.get(i);
			// Search for firstName
			q = em.createQuery("SELECT COUNT(*) FROM Author a WHERE a.firstName = ?1 AND a.lastname = ?2 AND a.birthday = ?3");
			q.setParameter(1, author.getFirstName());
			q.setParameter(2, author.getLastName());
			q.setParameter(3, author.getBirthday());
			countAuthor = (Long) q.getSingleResult();
			if (countAuthor < 1) {
				return false;
			}
		}
		return true;
	}
}