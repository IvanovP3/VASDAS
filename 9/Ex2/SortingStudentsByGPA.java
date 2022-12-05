import java.util.ArrayList;
public class SortingStudentsByGPA implements Comparator {

	public ArrayList<Student> Sort(ArrayList <Student> list) {
		if (list.size() < 2) return list;

		Student pivot = list.get(0);
		ArrayList<Student> list1 = new ArrayList<Student>();
		ArrayList<Student> list2 = new ArrayList<Student>();

		for (int i = 1; i < list.size(); i++) {
			if (pivot.getId() > list.get(i).getId()) {
				list1.add(list.get(i));
			} else {
				list2.add(list.get(i));
			}
		}

		ArrayList<Student> sortedList = Sort(list1);
		sortedList.add(pivot);
		sortedList.addAll(Sort(list2));
		return sortedList;

	}


	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();

		SortingStudentsByGPA a = new SortingStudentsByGPA();

		ArrayList<Student> list = new ArrayList<Student>();
		ArrayList<Student> sortedList;
		list.add(student4);
		list.add(student3);
		list.add(student2);
		list.add(student5);
		list.add(student1);

		sortedList = a.Sort(list);

		System.out.println("After sorting:");
		for (int i = 0; i < sortedList.size(); i++) {
			System.out.println(sortedList.get(i).getId());
		}

	}

}