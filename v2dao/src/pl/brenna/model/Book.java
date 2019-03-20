package pl.brenna.model;

public class Book {
	private String isbn;
	private String title;
	private String description;
	
	public Book(String isbn, String title, String description) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.description = description;
	}
	
	public Book() {}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
