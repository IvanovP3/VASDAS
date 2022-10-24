import java.util.ArrayList;
public class BookShelf {
	static ArrayList <Book> bookList = new ArrayList<Book>();

	public static ArrayList earlyYear() {
		ArrayList <Integer> idList = new ArrayList<Integer>();
		int min = 10000;
		int id = -1;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getYear() < min) {
				min = bookList.get(i).getYear();
			}
		}

		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getYear() == min) idList.add(i);
		}

		return idList;
	}


	public static ArrayList lastYear() {
		ArrayList <Integer> idList = new ArrayList<Integer>();
		int max = -10000;
		int id = -1;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getYear() > max) {
				max = bookList.get(i).getYear();
			}
		}

		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getYear() == max) idList.add(i);
		}

		return idList;
	}


	public static void sortBooks() {
		boolean key = true;
		while(key) {
			key = false;
			for (int i = 0; i < bookList.size(); i++) {
				if (i > 0) {
					if (bookList.get(i).getYear() < bookList.get(i-1).getYear()) {
						key = true;
						Book tempBook1 = bookList.get(i-1);
						Book tempBook2 = bookList.get(i);
						bookList.remove(i-1);
						bookList.add(i-1, tempBook2);
						bookList.remove(i);
						bookList.add(i, tempBook1);
					}
				}
			}
		}
	}

}