import java.util.Scanner;
import java.util.ArrayList;
public class Shop {

	static ArrayList <Computer> productList = new ArrayList<Computer>();

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        boolean shopWork = true;
        int clientChoice = 0;
        int id;
        String company, model, command;
        int price, maxPrice, minPrice;
        boolean key;

        

        while (shopWork) {
        	key = false;
            System.out.println("Menu:");
            System.out.println("1 - add product");
            System.out.println("2 - search product");
            System.out.println("3 - buy (remove)");
            System.out.println("4 - exit from system");
            System.out.println("5 - work with PC");
            System.out.println(">> ");
            clientChoice = src.nextInt();
            src.nextLine();
            System.out.println("");

            if (clientChoice == 1) {

                System.out.println("Enter the company of product>>");
                company = src.nextLine();
                System.out.println("");
                System.out.print("Enter the model of product>>");
                model = src.nextLine();
                System.out.println("");
                System.out.print("Enter the price of product>>");
                price = src.nextInt();
                Computer computer = new Computer(company, model, price);
                productList.add(computer);
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
            } else if (clientChoice == 5) {
                while (true) {
                    System.out.print("Enter the id of PC >> ");
                    id = src.nextInt();
                    src.nextLine();
                    System.out.print("Enter the command (\"run\" for start PC, \"shutdown\" for turning it off, \"monitor.run\" for turning monitor on, \"monitor.off\" for turning it off and \"exit\" for returning to the main menu) >>");
                    command = src.nextLine();
                    System.out.println();
                    if (command.equals("run")) {
                        productList.get(id).run();
                    } else if (command.equals("monitor.run")) {
                        productList.get(id).monitor.run();
                    } else if (command.equals("shutdown")) {
                        productList.get(id).shutdown();
                    } else if (command.equals("monitor.shutdown")) {
                        productList.get(id).monitor.shutdown();
                    } else break;
                }

            } else System.out.println("INCORRECT COMMAND!!!");
        
        }
    }
}