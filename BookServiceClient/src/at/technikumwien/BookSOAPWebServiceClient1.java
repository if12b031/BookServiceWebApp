package at.technikumwien;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class BookSOAPWebServiceClient1 {
	public static void main(String[] args) throws Exception {
		ClientAuthenticator.setAsDefault("stefan", "write");
		URL wsdl = new URL("http://localhost:8080/BookServiceWebApp/BookSOAPWebServiceImpl?wsdl");
		QName serviceName = new QName("http://technikumwien.at/", "BookSOAPWebServiceImplService");

		Service service = Service.create(wsdl, serviceName);
		BookSOAPWebService port = service.getPort(BookSOAPWebService.class);

		port.searchBook("Book").forEach(System.out::println);
	}
}