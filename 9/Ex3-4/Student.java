public class Student {
	private static int lastId = 0;
	private int id;
	Student() {
		lastId++;
		this.id = lastId;
	}

	public int getId() {
		return this.id;
	}

}