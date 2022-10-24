import java.util.Scanner;
public abstract class Transport {
	private final int speed; // km/h
	private final int cost; // RUB per one person per hour

	Transport(int speed, int cost) {
		this.speed = speed;
		this.cost = cost;
	}


	public double calcTime(int distance) {
		return (double) distance / this.speed;
	}

	public double calcCost(int distance, int capacity, int baggage) {
		return this.calcTime(distance) * cost * (capacity + ((float) baggage / 80));
	}

	public static String formatt(double timeInHours) {
		if (timeInHours < 1) return (int) (timeInHours * 60 + 1) + " min";
		else return ((int) timeInHours) + " h " + (int) ((timeInHours - (int) (timeInHours)) * 60) + " min";
	}


	public static void main(String[] args) {
		int distance, capacity, baggageWeight;
		Scanner src = new Scanner(System.in);
		System.out.print("Enter the distance (km) >> ");
		distance = src.nextInt();
		src.nextLine();
		System.out.println();
		System.out.print("How many passengers? >> ");
		capacity = src.nextInt();
		src.nextLine();
		System.out.println();
		System.out.print("Mass of baggage? (kg)>> ");
		baggageWeight = src.nextInt();
		src.nextLine();
		System.out.println();

		Aircraft plane = new Aircraft();
		Train train = new Train();
		Ship ship = new Ship();
		Car car = new Car();


		System.out.println("By car (" + formatt(car.calcTime(distance)) + ") will cost: " + (int) (car.calcCost(distance, capacity, baggageWeight)+1) + " RUB");
		System.out.println("By plane (" + formatt(plane.calcTime(distance)) + ") will cost: " + (int) (plane.calcCost(distance, capacity, baggageWeight)+1) + " RUB");
		System.out.println("By train (" + formatt(train.calcTime(distance)) + ") will cost: " + (int) (train.calcCost(distance, capacity, baggageWeight)+1) + " RUB");
		System.out.println("By ship (" + formatt(ship.calcTime(distance)) + ") will cost: " + (int) (ship.calcCost(distance, capacity, baggageWeight)+1) + " RUB");
		

	}
}