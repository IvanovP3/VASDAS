import java.util.Scanner;
import java.util.ArrayList;
public class Shop {

	static void println(String str) {
		System.out.println(str);
	}


	static ArrayList <Product> productList = new ArrayList<Product>();

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        boolean shopWork = true;
        boolean notAuthorized = true;
        int clientChoice = 0;
        int id;
        String company, model;
        int price, maxPrice, minPrice;
        boolean key;
        String login, password;



		println("registration");
        System.out.print("Enter new login >> ");
        login = src.nextLine();
        System.out.println();
        System.out.print("Enter new password >> ");
        password = src.nextLine();

        System.out.println("You entered login=" + login + ", password=" + password);
        System.out.println("Successfully registered!");



        


        while (notAuthorized) {
        	String userLogin, userPassword;
        	System.out.print("login >> ");
	        userLogin = src.nextLine();
	        System.out.println();
	        System.out.print("password >> ");
	        userPassword = src.nextLine();
	        System.out.println();
        	if (!userLogin.equals(login) || !userPassword.equals(password)) {
        		System.out.println("INCORRECT LOGIN OR PASSWORD!!! Try again!");
        	} else notAuthorized = false;
        }

        while (shopWork) {
        	key = false;
            System.out.println("Menu:");
            System.out.println("1 - add product");
            System.out.println("2 - search product");
            System.out.println("3 - buy (remove)");
            System.out.println("4 - exit from system)");
            System.out.print(">> ");
            clientChoice = src.nextInt();
            src.nextLine();
            System.out.println();

            if (clientChoice == 1) {

                System.out.print("Enter the company of product>>");
                company = src.nextLine();
                System.out.println();
                System.out.print("Enter the model of product>>");
                model = src.nextLine();
                System.out.println();
                System.out.print("Enter the price of product>>");
                price = src.nextInt();
                src.nextLine();
                Product computer = new Product(company, model, price);
                productList.add(computer);
                System.out.println("Successfully added!");

            } else if (clientChoice == 2) {
            	System.out.println("Do you want to find a computer at a specific price or something from certain company or a certain model?");
            	System.out.println("1 - choose at price");
            	System.out.println("2 - choose from certain company");
            	System.out.println("3 - choose a certain model");
            	System.out.print(">> ");
            	clientChoice = src.nextInt();
                src.nextLine();

            	if (clientChoice == 1) {
            		System.out.print("Enter maximum price>> ");
            		maxPrice = src.nextInt();
            		src.nextLine();
            		System.out.print("Enter minimum price>> ");
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
                        if (productList.get(i).getCompany().equals(company)) {
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
                        if (productList.get(i).getCompany().equals(company) && productList.get(i).getModel().equals(model)) {
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