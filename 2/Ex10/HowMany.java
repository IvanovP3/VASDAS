import java.util.Scanner;
public class HowMany {
	public static void main(String[] args) {
		String words;
		boolean key = false;
		int counter = 0;
		Scanner src = new Scanner(System.in);
		System.out.print("Enter the words >> ");
		words = src.nextLine();
		for (int i = 0; i < words.length(); i++) {
			if (words.charAt(i) == ' ' && key) {
				counter++;
				key = false;
			}
			if (i == words.length() - 1 && words.charAt(i) != ' ') counter++;
			if (words.charAt(i) != ' ') key = true;
		}

		System.out.println("You entered " + counter + " words");
	}
}