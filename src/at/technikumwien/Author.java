package at.technikumwien;

import java.util.Date;

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
@Table(name="author")
@NamedQuery(name="Author.selectAll", query="SELECT a FROM Author a")
@XmlType(name = "author")
@XmlRootElement
public class Author {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String firstname;
	private String lastname;
	private String nationality;
	private Date birthday;
	
	public Author() {}
	
	public Author(Long id, String title, String firstName, String lastName,
			String nationality, Date birthday) {
		super();
		this.id = id;
		this.title = title;
		this.firstname = firstName;
		this.lastname = lastName;
		this.nationality = nationality;
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", title=" + title + ", firstName="
				+ firstname + ", lastName=" + lastname + ", nationality="
				+ nationality + ", birthday=" + birthday
				+ "]";
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
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@XmlAttribute(name = "firstname")
	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
	@XmlAttribute(name = "lastname")
	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	@XmlAttribute
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@XmlAttribute(name = "birthdate")
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}	
}
