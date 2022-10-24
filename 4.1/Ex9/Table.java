public class Table extends Product {
	Table(String company, String model, int price) {
    	super(company, model, price);
    }

    public String getType() {
    	return "Table";
    }


}