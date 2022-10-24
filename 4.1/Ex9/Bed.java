public class Bed extends Product {
    Bed(String company, String model, int price) {
    	super(company, model, price);
    }

    public String getType() {
    	return "Bed";
    }


}