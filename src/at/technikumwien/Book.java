package at.technikumwien;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="book")
@NamedQuery(name="Book.selectAll", query="SELECT b FROM Book b")
@XmlRootElement
public class Book {
	
	@Id @GeneratedValue
	private Long id;
	private String isbn;
	private String title;
	private String subtitle;
	private String description;
	private int pages;
	private List<Author> authors;
	private Publisher publisher;

	public Book() {}

	public Book(Long id, String isbn, String title, String subtitle,
			String description, int pages, List<Author> authors,
			Publisher publisher) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.subtitle = subtitle;
		this.description = description;
		this.pages = pages;
		this.authors = authors;
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title
				+ ", subtitle=" + subtitle + ", description=" + description
				+ ", pages=" + pages + ", authors=" + authors + ", publisher="
				+ publisher + "]";
	}

//	SETTER & GETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
}
