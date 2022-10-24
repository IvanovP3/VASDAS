import java.util.Scanner;
public class Poker {
	public static void main(String[] args) {
		int numberOfPlayers;
		Scanner src = new Scanner(System.in);
		System.out.print("Enter the number of players (max - 10)>>");
		numberOfPlayers = src.nextInt();
		src.nextLine();
		if (numberOfPlayers <= 10 && numberOfPlayers >= 1) {
			int[] Cards = new int[numberOfPlayers * 5];
			System.out.println();

			for (int i = 0; i < numberOfPlayers * 5; i++) {
				boolean key = true;
				while(key) {
					key = false;
					int card = (int) Math.floor(Math.random() * 52 + 1);
					for (int j = 0; j < Cards.length; j++) {
						if (card == Cards[j]) key = true;
					}
					if (!key) Cards[i] = card;
				}
			}

			for (int i = 0; i < numberOfPlayers * 5; i++) {
				System.out.print(Cards[i] + " ");
				if ((i + 1) % 5 == 0) {
					System.out.println();
					System.out.println();
				}
			}
		} else System.out.println("Processor protection system caught danger: program stopped automatically");
	}
}