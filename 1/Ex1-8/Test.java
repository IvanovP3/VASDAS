import java.util.Scanner;
public class Test {

	public static int factorial(int number) {
		if (number == 1) return number;
		else return number * factorial(number - 1);
	}


	public static void main(String[] args) {

		System.out.println("ex 1.3");

		int k = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers in array? >> ");
		if (sc.hasNextInt()) {
			k = sc.nextInt();
			if (k < 1) System.out.println("Incorrect value!!!");
		} else System.out.println("This is not a number!!!");
		
		int [] numbers = new int[k];

		System.out.println("Enter the numbers:");
		for (int i = 0; i < k; i++) {
			if (sc.hasNextInt()) {
				numbers[i] = sc.nextInt();
				sum += numbers[i];
			} else System.out.println("This is not a number!!!");
		}
		System.out.println("SUM = " + sum);
		System.out.println("Sr. Arif. = " + ((double) sum / k));






		System.out.println("");
		System.out.println("ex 1.4");

		k = 0;
		sum = 0;
		int min = 1000000;
		int max = -1000000;
		System.out.println("How many numbers in array? >> ");
		if (sc.hasNextInt()) {
			k = sc.nextInt();
			if (k < 1) System.out.println("Incorrect value!!!");
		} else System.out.println("This is not a number!!!");

		int [] numbers2 = new int[k];
		System.out.println("Enter the numbers:");
		int temp = 0;
		while(temp < k) {
			if (sc.hasNextInt()) {
				numbers2[temp] = sc.nextInt();
				sum += numbers2[temp];
			} else System.out.println("This is not a number!!!");
			temp++;
		}

		for (int i = 0; i < k; i++) {
			if (numbers2[i] < min) min = numbers2[i];
			if (numbers2[i] > max) max = numbers2[i];
		}

		System.out.println("SUM = " + sum);
		System.out.println("MIN = " + min);
		System.out.println("MAX = " + max);





		System.out.println("");
		System.out.println("ex 1.5");

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}




		System.out.println("");
		System.out.println("ex 1.6");

		for (int i = 1; i <= 10; i++) {
			System.out.println((float) 1 / i);
		}




		System.out.println("");
		System.out.println("ex 1.7");
		System.out.println(factorial(sc.nextInt()));


	}
}