public interface Priceable {
	public int getPrice();

	public static void main(String [] args) {
		Car car = new Car();
		Milk milk = new Milk();
		Pencil pencil = new Pencil();
		System.out.println("Car: " + car.getPrice() + " RUB");
		System.out.println("Milk: " + milk.getPrice() + " RUB");
		System.out.println("Pencil: " + pencil.getPrice() + " RUB");
	}
}