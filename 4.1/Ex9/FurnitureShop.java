import java.util.Scanner;
import java.util.ArrayList;
public class FurnitureShop {

	static ArrayList <Product> productList = new ArrayList<Product>();

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        boolean shopWork = true;
        int clientChoice = 0;
        int id, type;
        String company, model;
        int price, maxPrice, minPrice;
        boolean key = false;


        while (shopWork) {
            System.out.println("Menu:");
            System.out.println("1 - add product");
            System.out.println("2 - search product");
            System.out.println("3 - buy (remove)");
            System.out.println("4 - exit from system)");
            System.out.println(">> ");
            clientChoice = src.nextInt();
            src.nextLine();
            System.out.println("");

            if (clientChoice == 1) {
                System.out.println("Enter the type of product (1 - bed, 2 - chair, 3 - table, 4 - wardrobe)>>");
                type = src.nextInt();
                src.nextLine();
                System.out.println("");
                System.out.println("Enter the company of product>>");
                company = src.nextLine();
                System.out.println("");
                System.out.print("Enter the model of product>>");
                model = src.nextLine();
                System.out.println("");
                System.out.print("Enter the price of product>>");
                price = src.nextInt();
                
                Product product;
                switch (type){
                    case 1:
                        product = new Bed(company, model, price);
                    break;
                    case 2:
                        product = new Chair(company, model, price);
                    break;
                    case 3:
                        product = new Table(company, model, price);
                    break;
                    default:
                        product = new Wardrobe(company, model, price);
                    break;
                }


                productList.add(product);
                System.out.println("Successfully added!");

            } else if (clientChoice == 2) {
            	System.out.println("Do you want to find a computer at a specific price or something from certain company or a certain model?");
            	System.out.println("1 - choose at price");
            	System.out.println("2 - choose from certain company");
            	System.out.println("3 - choose a certain model");
            	System.out.println(">> ");
            	clientChoice = src.nextInt();
                src.nextLine();

            	if (clientChoice == 1) {
            		System.out.println("Enter maximum price>> ");
            		maxPrice = src.nextInt();
            		System.out.println("Enter minimum price>> ");
            		minPrice = src.nextInt();
                    src.nextLine();
            		System.out.println("Here what I have found:");
            		for (int i = 0; i < productList.size(); i++) {
            			if (productList.get(i).getPrice() >= minPrice && productList.get(i).getPrice() <= maxPrice) {
            				System.out.println(productList.get(i).toString());
            				key = true;
            			}
            		}
            		if (!key) System.out.println("not found");
            		
            	} else if (clientChoice == 2) {
                    System.out.print("Enter the company>> ");
                    company = src.nextLine();
                    System.out.println("Here what I have found:");
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getCompany() == company) {
                            System.out.println(productList.get(i).toString());
                            key = true;
                        }
                    }
                    if (!key) System.out.println("not found");

                } else if (clientChoice == 3) {
                    System.out.print("Enter the company>> ");
                    company = src.nextLine();
                    System.out.print("Enter the model>> ");
                    model = src.nextLine();
                    System.out.println("Here what I have found:");
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getCompany() == company && productList.get(i).getModel() == model) {
                            System.out.println(productList.get(i).toString());
                            key = true;
                        }
                    }
                    if (!key) System.out.println("not found");
                }
            	
            	clientChoice = 2;
                
            } else if (clientChoice == 3) {
                System.out.print("Enter the id of product>> ");
                id = src.nextInt();
                src.nextLine();
                for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getId() == id) {
                            productList.remove(i);
                            key = true;
                            System.out.println("Successfully removed!");
                        }
                    }
                    if (!key) System.out.println("not found");

            } else if (clientChoice == 4) {
                shopWork = false;
            } else System.out.println("INCORRECT COMMAND!!!");
        
        }
    }
}