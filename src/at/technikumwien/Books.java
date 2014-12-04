package at.technikumwien;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "books")
@XmlAccessorType (XmlAccessType.FIELD)
public class Books
{
    private List<Book> book = null;
 
    @XmlElement(name = "book")
    public List<Book> getBooks() {
        return book;
    }
 
    public void setBooks(List<Book> books) {
        this.book = books;
    }
}