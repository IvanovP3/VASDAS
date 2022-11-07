public class TShirt extends Clothes implements ManClothing, WomenClothing {
	/*TShirt() {
		super(3);
	}*/
	public void dressMan() {
		System.out.println("TShirt is on man!");
	}
	public void dressWomen() {
		System.out.println("TShirt is on woman!");
	}
}