
package at.technikumwien.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.technikumwien.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchBook_QNAME = new QName("http://technikumwien.at/", "searchBook");
    private final static QName _Author_QNAME = new QName("http://technikumwien.at/", "author");
    private final static QName _InsertBook_QNAME = new QName("http://technikumwien.at/", "insertBook");
    private final static QName _Book_QNAME = new QName("http://technikumwien.at/", "book");
    private final static QName _InsertBookResponse_QNAME = new QName("http://technikumwien.at/", "insertBookResponse");
    private final static QName _AllPublishers_QNAME = new QName("http://technikumwien.at/", "allPublishers");
    private final static QName _InsertBooks_QNAME = new QName("http://technikumwien.at/", "insertBooks");
    private final static QName _AllAuthorsResponse_QNAME = new QName("http://technikumwien.at/", "allAuthorsResponse");
    private final static QName _AllBooksResponse_QNAME = new QName("http://technikumwien.at/", "allBooksResponse");
    private final static QName _SearchBookResponse_QNAME = new QName("http://technikumwien.at/", "searchBookResponse");
    private final static QName _AllAuthors_QNAME = new QName("http://technikumwien.at/", "allAuthors");
    private final static QName _AllBooks_QNAME = new QName("http://technikumwien.at/", "allBooks");
    private final static QName _AllPublishersResponse_QNAME = new QName("http://technikumwien.at/", "allPublishersResponse");
    private final static QName _Publisher_QNAME = new QName("http://technikumwien.at/", "publisher");
    private final static QName _InsertBooksResponse_QNAME = new QName("http://technikumwien.at/", "insertBooksResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.technikumwien.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllBooksResponse }
     * 
     */
    public AllBooksResponse createAllBooksResponse() {
        return new AllBooksResponse();
    }

    /**
     * Create an instance of {@link SearchBookResponse }
     * 
     */
    public SearchBookResponse createSearchBookResponse() {
        return new SearchBookResponse();
    }

    /**
     * Create an instance of {@link AllBooks }
     * 
     */
    public AllBooks createAllBooks() {
        return new AllBooks();
    }

    /**
     * Create an instance of {@link AllAuthors }
     * 
     */
    public AllAuthors createAllAuthors() {
        return new AllAuthors();
    }

    /**
     * Create an instance of {@link AllPublishersResponse }
     * 
     */
    public AllPublishersResponse createAllPublishersResponse() {
        return new AllPublishersResponse();
    }

    /**
     * Create an instance of {@link Publisher }
     * 
     */
    public Publisher createPublisher() {
        return new Publisher();
    }

    /**
     * Create an instance of {@link InsertBooksResponse }
     * 
     */
    public InsertBooksResponse createInsertBooksResponse() {
        return new InsertBooksResponse();
    }

    /**
     * Create an instance of {@link SearchBook }
     * 
     */
    public SearchBook createSearchBook() {
        return new SearchBook();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link InsertBook }
     * 
     */
    public InsertBook createInsertBook() {
        return new InsertBook();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link InsertBookResponse }
     * 
     */
    public InsertBookResponse createInsertBookResponse() {
        return new InsertBookResponse();
    }

    /**
     * Create an instance of {@link AllPublishers }
     * 
     */
    public AllPublishers createAllPublishers() {
        return new AllPublishers();
    }

    /**
     * Create an instance of {@link AllAuthorsResponse }
     * 
     */
    public AllAuthorsResponse createAllAuthorsResponse() {
        return new AllAuthorsResponse();
    }

    /**
     * Create an instance of {@link InsertBooks }
     * 
     */
    public InsertBooks createInsertBooks() {
        return new InsertBooks();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "searchBook")
    public JAXBElement<SearchBook> createSearchBook(SearchBook value) {
        return new JAXBElement<SearchBook>(_SearchBook_QNAME, SearchBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "author")
    public JAXBElement<Author> createAuthor(Author value) {
        return new JAXBElement<Author>(_Author_QNAME, Author.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "insertBook")
    public JAXBElement<InsertBook> createInsertBook(InsertBook value) {
        return new JAXBElement<InsertBook>(_InsertBook_QNAME, InsertBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "book")
    public JAXBElement<Book> createBook(Book value) {
        return new JAXBElement<Book>(_Book_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "insertBookResponse")
    public JAXBElement<InsertBookResponse> createInsertBookResponse(InsertBookResponse value) {
        return new JAXBElement<InsertBookResponse>(_InsertBookResponse_QNAME, InsertBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllPublishers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "allPublishers")
    public JAXBElement<AllPublishers> createAllPublishers(AllPublishers value) {
        return new JAXBElement<AllPublishers>(_AllPublishers_QNAME, AllPublishers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "insertBooks")
    public JAXBElement<InsertBooks> createInsertBooks(InsertBooks value) {
        return new JAXBElement<InsertBooks>(_InsertBooks_QNAME, InsertBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllAuthorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "allAuthorsResponse")
    public JAXBElement<AllAuthorsResponse> createAllAuthorsResponse(AllAuthorsResponse value) {
        return new JAXBElement<AllAuthorsResponse>(_AllAuthorsResponse_QNAME, AllAuthorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "allBooksResponse")
    public JAXBElement<AllBooksResponse> createAllBooksResponse(AllBooksResponse value) {
        return new JAXBElement<AllBooksResponse>(_AllBooksResponse_QNAME, AllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "searchBookResponse")
    public JAXBElement<SearchBookResponse> createSearchBookResponse(SearchBookResponse value) {
        return new JAXBElement<SearchBookResponse>(_SearchBookResponse_QNAME, SearchBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllAuthors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "allAuthors")
    public JAXBElement<AllAuthors> createAllAuthors(AllAuthors value) {
        return new JAXBElement<AllAuthors>(_AllAuthors_QNAME, AllAuthors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "allBooks")
    public JAXBElement<AllBooks> createAllBooks(AllBooks value) {
        return new JAXBElement<AllBooks>(_AllBooks_QNAME, AllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllPublishersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "allPublishersResponse")
    public JAXBElement<AllPublishersResponse> createAllPublishersResponse(AllPublishersResponse value) {
        return new JAXBElement<AllPublishersResponse>(_AllPublishersResponse_QNAME, AllPublishersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Publisher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "publisher")
    public JAXBElement<Publisher> createPublisher(Publisher value) {
        return new JAXBElement<Publisher>(_Publisher_QNAME, Publisher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "insertBooksResponse")
    public JAXBElement<InsertBooksResponse> createInsertBooksResponse(InsertBooksResponse value) {
        return new JAXBElement<InsertBooksResponse>(_InsertBooksResponse_QNAME, InsertBooksResponse.class, null, value);
    }

}
