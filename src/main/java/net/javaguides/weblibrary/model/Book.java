package net.javaguides.weblibrary.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")

public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "writer_name")
	private String writerName;
	
	@Column(name = "year_issue")
	private String yearIssue;

	public Book() {
		
	}
	
	public Book(String bookName, String writerName) {
		super();
		this.bookName = bookName;
		this.writerName = writerName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getYearIssue() {
		return yearIssue;
	}

	public void setYearIssue(String yearIssue) {
		this.yearIssue = yearIssue;
	}
	
	
}
