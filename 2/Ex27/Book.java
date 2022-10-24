public class Book {
	private String author, title;
	private int year;


	Book(String author, String title, int year) {
		this.author = author;
		this.title = title;
		this.year = year;
	}


	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Book{author=" + this.author + ", title=" + this.title + ", year=" + this.year + "}";
	}


}