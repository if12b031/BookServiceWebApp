package at.technikumwien;

import at.technikumwien.generated.BookSOAPWebServiceImplService;
import at.technikumwien.generated.BookSOAPWebService;

public class BookSOAPWebServiceClient2 {
	public static void main(String[] args) {
		BookSOAPWebServiceImplService service = new BookSOAPWebServiceImplService();
		BookSOAPWebService port = service.getBookSOAPWebServiceImplPort();
		
		port.allBooks().forEach(System.out::println);
	}
}