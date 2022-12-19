import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
public class RPNcalculator {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		String command;
		double a, b;
		ArrayList<Stack> array;
		int counter = 0;
		Stack<Double> operands = new Stack<>();
		Stack<String> operations = new Stack<>();
		System.out.println("Enter the expression or \"exit\" or \"clear\" or \"stack\":");
		while (true) {
			command = src.nextLine();
			command = command.replace(" ", "");

			if (command.equals("exit")) {
				break;
			}

			if (command.equals("clear")) {
				operands.clear();
				operations.clear();
				continue;
			}

			if (command.equals("stack")) {
				System.out.println("Operands: " + operands);
				continue;
			}


			if (!command.equals("+") & !command.equals("-") & !command.equals("*") & !command.equals("/")) {
				try {

					operands.push(Double.parseDouble(command));

				} catch(NumberFormatException e) {

					System.out.println("You entered incorrect number or command! You may enter only \"exit\", \"clear\", \"stack\", +, -, *, / or double number! Try again!");
					continue;

				}
			} else {
				operations.push(command);
			}


			if (command.equals("+") | command.equals("-") | command.equals("*") | command.equals("/")) {
				if (operands.size() - operations.size() > 0) {
					b = operands.pop();
					a = operands.pop();
					switch(operations.pop()) {
						case "+":
							operands.push(a + b);
							break;
						case "-":
							operands.push(a - b);
							break;
						case "*":
							operands.push(a * b);
							break;
						case "/":
							if (b != 0) operands.push(a / b);
							else {
								operands.push(a);
								operands.push(b);
								System.out.println("Zero division error! Enter other arithmetic operation (NOT \"/\") or clear the stack!");
								continue;
							}
							break;
					}
				} else {
					if (operands.size() == 0) System.out.println("Not enough operands for calculating! Enter two numbers or clear the stack!");
					else System.out.println("Not enough operands for calculating! Enter the number or clear the stack!");
					
					if (operations.size() > 0) {
						operations.clear();
						System.out.println("operation\'s stack was cleared");
					}

					continue;
				}
			}
			
			if (operations.size() == 0 & (command.equals("+") | command.equals("-") | command.equals("*") | command.equals("/"))) System.out.println("Answer: " + operands.peek());
		}
	}
}