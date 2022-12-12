import java.util.ArrayList;
public class StudentSort {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();

		ArrayList<Student> list = new ArrayList<Student>();
		ArrayList<Student> sortedList = new ArrayList<Student>();
		list.add(student4);
		list.add(student3);
		list.add(student2);
		list.add(student5);
		list.add(student1);


		System.out.println("Order of IDs before sorting:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId());
		}



		//sorting..
		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				sortedList.add(list.get(i));
			} else {
				for (int j = 0; j < sortedList.size(); j++) {
					if (list.get(i).getId() <= sortedList.get(j).getId()) {
						sortedList.add(j, list.get(i));
						break;
					}
					if (j == sortedList.size() - 1) {
						sortedList.add(list.get(i));
						break;
					}
				}
			}
		}


		System.out.println("After sorting:");
		for (int i = 0; i < sortedList.size(); i++) {
			System.out.println(sortedList.get(i).getId());
		}

	}
}