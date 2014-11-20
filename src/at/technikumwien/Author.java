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
@XmlRootElement(name = "author")
public class Author {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String firstName;
	private String lastName;
	private String nationality;
	private Date birthday;
	
	public Author() {}
	
	public Author(Long id, String title, String firstName, String lastName,
			String nationality, Date birthday) {
		super();
		this.id = id;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", title=" + title + ", firstName="
				+ firstName + ", lastName=" + lastName + ", nationality="
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
	@XmlAttribute
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@XmlAttribute
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@XmlAttribute
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@XmlAttribute
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}	
}
