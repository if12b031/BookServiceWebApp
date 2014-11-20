package at.technikumwien;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="publisher")
@NamedQuery(name="Publisher.selectAll", query="SELECT p FROM Publisher p")
@XmlRootElement
public class Publisher {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String postCode;
	private String countryCode;
	private String streetNumber;
	private String streetName;
	
	public Publisher() {}
	
	public Publisher(Long id, String name, String postcode, String countrycode,
			String streetNumber, String streetName) {
		super();
		this.id = id;
		this.name = name;
		this.postCode = postcode;
		this.countryCode = countrycode;
		this.streetNumber = streetNumber;
		this.streetName = streetName;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", postCode="
				+ postCode + ", countryCode=" + countryCode + ", streetNumber="
				+ streetNumber + ", streetName=" + streetName + "]";
	}
	
//	SETTERS & GETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPostcode() {
		return postCode;
	}

	public void setPostcode(String postcode) {
		this.postCode = postcode;
	}

	public String getCountrycode() {
		return countryCode;
	}

	public void setCountrycode(String countrycode) {
		this.countryCode = countrycode;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}	
}
