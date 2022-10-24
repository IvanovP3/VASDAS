public class Computer {

	private int id;
	private Company company;
    private String model;
    private int price;
    private static int maxId;


    private enum Company {
    	HP, 
    	Sony,
    	Samsung,
    	LG,
    	ASUS,
    	Lenovo,
    	Toshiba
    }

	Memory memory;
	Monitor monitor;
	Processor processor;
	private boolean isTurnedOn;

	


 	public Computer(String company, String model, int price) {
        this.memory = new Memory();
        this.monitor = new Monitor();
        this.processor = new Processor();
        
    	this.isTurnedOn = false;
    	this.id = this.maxId;
    	this.maxId++;
        switch(company) {
        	case "HP":
        		this.company = Company.HP;
        	break;
        	case "Sony":
        		this.company = Company.Sony;
        	break;
        	case "Samsung":
        		this.company = Company.Samsung;
        	break;
        	case "LG":
        		this.company = Company.LG;
        	break;
        	case "ASUS":
        		this.company = Company.ASUS;
        	break;
        	case "Lenovo":
        		this.company = Company.Lenovo;
        	break;
        	default:
        		this.company = Company.Toshiba;
        }
        this.model = model;
        this.price = price;
    }






	public void run() {
		if (!this.isTurnedOn) {
            this.processor.run();
            this.memory.run();
			this.isTurnedOn = true;
			System.out.println("Computer is running: " + this.isTurnedOn);
		} else System.out.println("COMPUTER TURNED ON");
	}

	public void shutdown() {
		if (this.isTurnedOn) {
		this.processor.shutdown();
		this.memory.shutdown();
		this.isTurnedOn = false;
		System.out.println("Computer is running: " + this.isTurnedOn);
		} else System.out.println("COMPUTER TURNED OFF");
	}

    public int getId() {
        return this.id;
    }

    public String getCompany() {
        return this.company.toString();
    }

    public void setCompany(String company) {
        switch(company) {
        	case "HP":
        		this.company = Company.HP;
        	break;
        	case "Sony":
        		this.company = Company.Sony;
        	break;
        	case "Samsung":
        		this.company = Company.Samsung;
        	break;
        	case "LG":
        		this.company = Company.LG;
        	break;
        	case "ASUS":
        		this.company = Company.ASUS;
        	break;
        	case "Lenovo":
        		this.company = Company.Lenovo;
        	break;
        	default:
        		this.company = Company.Toshiba;
        }
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
    	return "Product{id=" + this.id + ", company=" + this.company + ", model=" + this.model + ", price=" + this.price + "}";
    }
	
}