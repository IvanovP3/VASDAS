import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		double r;
		Circle a = new Circle(1, 2, 3, "red");
		System.out.println("Length of circle = " + a.getPerimetr() + "sm");
		Scanner source = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		r = source.nextDouble();
		a.setR(r);
		System.out.println("Length of circle = " + a.getPerimetr() + "sm");
		a.toString();

	}
}