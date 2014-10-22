package at.technikumwien;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="author")
@NamedQuery(name="Author.selectAll", query="SELECT n FROM Author n")
public class Author {

	@Id @GeneratedValue
	private Long id;
	private String title;
	private String firstName;
	private String lastName;
	private String nationality;
	private Date birthday;
	
	public Author() {}
	
	public Author(Long id, String title, String firstName, String lastName,
			String nationality, char gender, Date birthday) {
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
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}	
}
