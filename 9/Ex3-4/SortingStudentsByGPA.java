import java.util.ArrayList;
public class SortingStudentsByGPA {
	/*public static int counter = 0;
	public static void count() {
		counter++;
		if (counter >= 100){
			System.out.println("STOP");
			System.exit(0);
		}
	}*/
	public ArrayList<Integer> Sort(ArrayList <Integer> left, ArrayList <Integer> right) {
		//count();
	   // System.out.println("Sort(left = " + left + " , right = " + right + ")");
	    
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    
	    while (left.size() > 0 && right.size() > 0) {
	      
	        if (left.get(0) < right.get(0)) {
	            arr.add(left.get(0));
	            left.remove(0);
	        } else {
	            arr.add(right.get(0));
	            right.remove(0);
	        }
	    }
	    //System.out.println("\tResult: " + arr);
	    left.addAll(right);
	    arr.addAll(left);
	    //System.out.println("Returning arr = " + arr + "\n");
	    return arr;
	}

	public ArrayList<Integer> mergeSort(ArrayList <Integer> array) {
		//count();
		//System.out.println("mergeSort(array = " + array + ")");
		int half = array.size() / 2;

		if (array.size() < 2) {
			//System.out.println("Returning array = " + array + "\n");
			return array;
		}

		ArrayList<Integer> left = new ArrayList<Integer>(array.subList(0, half));
		for (int i = 1; i <= half; i++) {
			array.remove(0);
		}
		
		//System.out.println("send to Sort results of: mergeSort(left = " + left + ") and merge(array = " + array + ")\n");
		return Sort(mergeSort(left), mergeSort(array));
	}
	

	public static void main(String[] args) {
		//count();
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();

		SortingStudentsByGPA a = new SortingStudentsByGPA();

		ArrayList<Student> list = new ArrayList<Student>();
		ArrayList<Integer> sortedList;
		list.add(student4);
		list.add(student3);
		list.add(student2);
		list.add(student5);
		list.add(student1);

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {
			list2.add(list.get(i).getId());
		}

		System.out.println("Before sorting: " + list2);
		sortedList = a.mergeSort(list2);

		System.out.println("After sorting:");
		for (int i = 0; i < sortedList.size(); i++) {
			System.out.println(sortedList.get(i));
		}

	}

}