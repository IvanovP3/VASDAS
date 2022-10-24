public class Wardrobe extends Product {
	Wardrobe(String company, String model, int price) {
    	super(company, model, price);
    }

    public String getType() {
    	return "Wardrobe";
    }


}