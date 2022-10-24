import java.util.ArrayList;
public abstract class Learner {
	public abstract String whoIsIt();
	public abstract String getName();
	static ArrayList<Learner> learnersList = new ArrayList<Learner>();

	public static void main(String [] args) {
		learnersList.add(new Pupil("Nikita"));
		learnersList.add(new Student("Igor"));
		learnersList.add(new Pupil("Ilya"));
		learnersList.add(new Student("Pavel"));
		learnersList.add(new Pupil("Gleb"));
		learnersList.add(new Student("Egor"));
		learnersList.add(new Pupil("Mikhail"));
		learnersList.add(new Student("Anastasiya"));
		learnersList.add(new Pupil("Erik"));
		learnersList.add(new Student("Sevastyan"));
		learnersList.add(new Student("Alexander"));

		for (int i = 0; i < learnersList.size(); i++) {
			System.out.print(learnersList.get(i).getName() + " is ");
			System.out.println(learnersList.get(i).whoIsIt());
		}

		System.out.println();

		System.out.println("STUDENTS:");

		for (int i = 0; i < learnersList.size(); i++) {
			if (learnersList.get(i).whoIsIt().equals("Student")) {
				System.out.println(learnersList.get(i).getName());
			}
		}

		System.out.println();

		System.out.println("PUPILS:");

		for (int i = 0; i < learnersList.size(); i++) {
			if (learnersList.get(i).whoIsIt().equals("Pupil")) {
				System.out.println(learnersList.get(i).getName());
			}
		}


	}
}