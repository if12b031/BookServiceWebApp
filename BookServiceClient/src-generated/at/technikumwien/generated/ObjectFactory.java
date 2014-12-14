
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
    private final static QName _GetAllPublishersResponse_QNAME = new QName("http://technikumwien.at/", "getAllPublishersResponse");
    private final static QName _InsertBook_QNAME = new QName("http://technikumwien.at/", "insertBook");
    private final static QName _GetAllBooks_QNAME = new QName("http://technikumwien.at/", "getAllBooks");
    private final static QName _Book_QNAME = new QName("http://technikumwien.at/", "book");
    private final static QName _InsertBookResponse_QNAME = new QName("http://technikumwien.at/", "insertBookResponse");
    private final static QName _InsertBooks_QNAME = new QName("http://technikumwien.at/", "insertBooks");
    private final static QName _GetAllPublishers_QNAME = new QName("http://technikumwien.at/", "getAllPublishers");
    private final static QName _GetAllBooksResponse_QNAME = new QName("http://technikumwien.at/", "getAllBooksResponse");
    private final static QName _SearchBookResponse_QNAME = new QName("http://technikumwien.at/", "searchBookResponse");
    private final static QName _Publisher_QNAME = new QName("http://technikumwien.at/", "publisher");
    private final static QName _GetAllAuthors_QNAME = new QName("http://technikumwien.at/", "getAllAuthors");
    private final static QName _InsertBooksResponse_QNAME = new QName("http://technikumwien.at/", "insertBooksResponse");
    private final static QName _GetAllAuthorsResponse_QNAME = new QName("http://technikumwien.at/", "getAllAuthorsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.technikumwien.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link SearchBookResponse }
     * 
     */
    public SearchBookResponse createSearchBookResponse() {
        return new SearchBookResponse();
    }

    /**
     * Create an instance of {@link GetAllAuthorsResponse }
     * 
     */
    public GetAllAuthorsResponse createGetAllAuthorsResponse() {
        return new GetAllAuthorsResponse();
    }

    /**
     * Create an instance of {@link Publisher }
     * 
     */
    public Publisher createPublisher() {
        return new Publisher();
    }

    /**
     * Create an instance of {@link GetAllAuthors }
     * 
     */
    public GetAllAuthors createGetAllAuthors() {
        return new GetAllAuthors();
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
     * Create an instance of {@link GetAllPublishersResponse }
     * 
     */
    public GetAllPublishersResponse createGetAllPublishersResponse() {
        return new GetAllPublishersResponse();
    }

    /**
     * Create an instance of {@link InsertBook }
     * 
     */
    public InsertBook createInsertBook() {
        return new InsertBook();
    }

    /**
     * Create an instance of {@link GetAllBooks }
     * 
     */
    public GetAllBooks createGetAllBooks() {
        return new GetAllBooks();
    }

    /**
     * Create an instance of {@link InsertBookResponse }
     * 
     */
    public InsertBookResponse createInsertBookResponse() {
        return new InsertBookResponse();
    }

    /**
     * Create an instance of {@link GetAllBooksResponse }
     * 
     */
    public GetAllBooksResponse createGetAllBooksResponse() {
        return new GetAllBooksResponse();
    }

    /**
     * Create an instance of {@link GetAllPublishers }
     * 
     */
    public GetAllPublishers createGetAllPublishers() {
        return new GetAllPublishers();
    }

    /**
     * Create an instance of {@link InsertBooks }
     * 
     */
    public InsertBooks createInsertBooks() {
        return new InsertBooks();
    }

    /**
     * Create an instance of {@link Book.Authors }
     * 
     */
    public Book.Authors createBookAuthors() {
        return new Book.Authors();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPublishersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "getAllPublishersResponse")
    public JAXBElement<GetAllPublishersResponse> createGetAllPublishersResponse(GetAllPublishersResponse value) {
        return new JAXBElement<GetAllPublishersResponse>(_GetAllPublishersResponse_QNAME, GetAllPublishersResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "getAllBooks")
    public JAXBElement<GetAllBooks> createGetAllBooks(GetAllBooks value) {
        return new JAXBElement<GetAllBooks>(_GetAllBooks_QNAME, GetAllBooks.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "insertBooks")
    public JAXBElement<InsertBooks> createInsertBooks(InsertBooks value) {
        return new JAXBElement<InsertBooks>(_InsertBooks_QNAME, InsertBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPublishers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "getAllPublishers")
    public JAXBElement<GetAllPublishers> createGetAllPublishers(GetAllPublishers value) {
        return new JAXBElement<GetAllPublishers>(_GetAllPublishers_QNAME, GetAllPublishers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "getAllBooksResponse")
    public JAXBElement<GetAllBooksResponse> createGetAllBooksResponse(GetAllBooksResponse value) {
        return new JAXBElement<GetAllBooksResponse>(_GetAllBooksResponse_QNAME, GetAllBooksResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Publisher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "publisher")
    public JAXBElement<Publisher> createPublisher(Publisher value) {
        return new JAXBElement<Publisher>(_Publisher_QNAME, Publisher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAuthors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "getAllAuthors")
    public JAXBElement<GetAllAuthors> createGetAllAuthors(GetAllAuthors value) {
        return new JAXBElement<GetAllAuthors>(_GetAllAuthors_QNAME, GetAllAuthors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "insertBooksResponse")
    public JAXBElement<InsertBooksResponse> createInsertBooksResponse(InsertBooksResponse value) {
        return new JAXBElement<InsertBooksResponse>(_InsertBooksResponse_QNAME, InsertBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAuthorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://technikumwien.at/", name = "getAllAuthorsResponse")
    public JAXBElement<GetAllAuthorsResponse> createGetAllAuthorsResponse(GetAllAuthorsResponse value) {
        return new JAXBElement<GetAllAuthorsResponse>(_GetAllAuthorsResponse_QNAME, GetAllAuthorsResponse.class, null, value);
    }

}
