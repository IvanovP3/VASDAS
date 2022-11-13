import java.util.ArrayList;
public interface Printable {
	public String getTitle();
	public void print();
	ArrayList <Printable> list = new ArrayList<Printable>();
	

	public static void printMagazine(ArrayList <Printable> printable) {
		System.out.println("Magazines:");
		for (int i = 0; i < printable.size(); i++) {
			if (printable.get(i) instanceof Magazine) {
				System.out.println(printable.get(i).getTitle());
			}
		}
	}

	public static void printBooks(ArrayList <Printable> printable) {
		System.out.println("Books:");
		for (int i = 0; i < printable.size(); i++) {
			if (printable.get(i) instanceof Book) {
				System.out.println(printable.get(i).getTitle());
			}
		}
	}

	public static void main(String [] args) {
		list.add(new Book("War and Peace"));
		list.add(new Book("Harry Potter"));
		list.add(new Magazine("Popular Mechanics"));

		printMagazine(list);
		printBooks(list);
	}


}