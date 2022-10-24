public class Pupil extends Learner {
	private String name;

	Pupil(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	public String whoIsIt() {
		return "Pupil";
	}
}