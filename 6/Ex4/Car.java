public class Car implements Priceable {
	private int price;
	Car() {
		this.price = 800000;
	}

	public int getPrice() {
		return this.price;
	}
}