public class Chair extends Product {
	Chair(String company, String model, int price) {
    	super(company, model, price);
    }

    public String getType() {
    	return "Chair";
    }


}