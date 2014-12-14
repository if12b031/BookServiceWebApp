package at.technikumwienclient;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import at.technikumwien.generated.Book;

@XmlRootElement(name = "books")
@XmlAccessorType (XmlAccessType.FIELD)
public class Books
{
	@XmlElement(name="book")
    public List<Book> book = null;

    public List<Book> getBooks() {
        return book;
    }
 
    public void setBooks(List<Book> books) {
        this.book = books;
    }
}