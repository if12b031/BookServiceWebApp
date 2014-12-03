package at.technikumwien;

import at.technikumwien.generated.BookSOAPWebServiceImplService;
import at.technikumwien.generated.BookSOAPWebService;


public class BookSOAPWebServiceClient2 {
	public static void main(String[] args) {
		ClientAuthenticator.setAsDefault("stefan", "write");
		BookSOAPWebServiceImplService service = new BookSOAPWebServiceImplService();
		BookSOAPWebService port = service.getBookSOAPWebServiceImplPort();

		port.getAllBooks().forEach(System.out::println);
		port.getAllAuthors().forEach(System.out::println);
		port.getAllPublishers().forEach(System.out::println);
	}
}