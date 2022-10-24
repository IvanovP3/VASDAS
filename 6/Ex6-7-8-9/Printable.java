import java.util.ArrayList;
public interface Printable {
	public void print();
	ArrayList <Printable> list = new ArrayList<Printable>();
	public static void main(String [] args) {
		list.add(new Book());
		list.add(new Book());
		list.add(new Shop());
		for (int i = 0; i < list.size(); i++) {
			list.get(i).print();
		}
	}


}