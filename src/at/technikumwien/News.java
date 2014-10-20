package at.technikumwien;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="t_news")
@NamedQuery(name="News.selectAll", query="SELECT n FROM News n")
public class News {
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", title=" + title + ", text=" + text
				+ "]";
	}

	@Id @GeneratedValue
	private Long newsId;
	private String title;
	private String text;
	
	public News(){}
	
	public News(Long newsId, String title, String text) {
		super();
		this.newsId = newsId;
		this.title = title;
		this.text = text;
	}

	public Long getNewsId() {
		return newsId;
	}

	public void setNewsId(Long newsId) {
		this.newsId = newsId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}


