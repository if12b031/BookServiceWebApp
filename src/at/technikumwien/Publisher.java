package at.technikumwien;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@Entity
@Table(name="publisher")
@NamedQuery(name="Publisher.selectAll", query="SELECT p FROM Publisher p")
@XmlType(propOrder={})
@XmlRootElement(name="publisher")
public class Publisher {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String postCode;
	private String countrycode;
	private String streetnumber;
	private String streetname;
	
	public Publisher() {}
	
	public Publisher(Long id, String name, String postcode, String countrycode,
			String streetNumber, String streetName) {
		super();
		this.id = id;
		this.name = name;
		this.postCode = postcode;
		this.countrycode = countrycode;
		this.streetnumber = streetNumber;
		this.streetname = streetName;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", postCode="
				+ postCode + ", countryCode=" + countrycode + ", streetNumber="
				+ streetnumber + ", streetName=" + streetname + "]";
	}
	
//	SETTERS & GETTERS
	@XmlAttribute
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@XmlAttribute
	public String getPostcode() {
		return postCode;
	}

	public void setPostcode(String postcode) {
		this.postCode = postcode;
	}
	@XmlAttribute
	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	@XmlAttribute
	public String getStreetNumber() {
		return streetnumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetnumber = streetNumber;
	}
	@XmlAttribute
	public String getStreetName() {
		return streetname;
	}

	public void setStreetName(String streetName) {
		this.streetname = streetName;
	}	
}
