public class Dog {
	private int age;
	private String name;

	public Dog(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int toHumanAge() {
		return this.age * 7;
	}

	@Override
	public String toString() {
		return "Dog{age=" + age + ", name=" + name + "}";
	}

}