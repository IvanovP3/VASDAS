public interface Nameable {
	public String getName();

	public static void main(String [] args) {
		Lion lion = new Lion();
		Parrot parrot = new Parrot();
		Human human = new Human();
		System.out.println(lion.getName());
		System.out.println(parrot.getName());
		System.out.println(human.getName());
	}


}