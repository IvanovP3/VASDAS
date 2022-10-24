import java.util.ArrayList;
public class BookTest {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		BookShelf.bookList.add(new Book("C", "d", 2014));
		BookShelf.bookList.add(new Book("A", "b", 2012));
		BookShelf.bookList.add(new Book("B", "c", 2013));
		BookShelf.bookList.add(new Book("E", "f", 2012));
		BookShelf.sortBooks();
		System.out.println(BookShelf.bookList);
	}
}