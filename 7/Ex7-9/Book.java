public class Book implements Printable {
	private String title;

	Book(String title) {
		this.title = title;
	}
	
	public void print() {
		System.out.println("book has been printed");
	}

	public String getTitle() {
		return this.title;
	}
}