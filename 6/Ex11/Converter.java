public class Converter implements Convertable {
	public double convertCF(double celsius) {
		return celsius * 1.8 + 32;
	}

	public double convertFC(double fahrenheit) {
		return (fahrenheit - 32) * 0.556;
	}

	public double convertCK(double celsius) {
		return celsius + 273;
	}

	public double convertKC(double kelvin) {
		return kelvin - 273;
	}

	public double convertFK(double fahrenheit) {
		return convertCK(convertFC(fahrenheit));
	}

	public double convertKF(double kelvin) {
		return convertCF(convertKC(kelvin));
	}

	public static void main(String[] args) {
		Converter converter = new Converter();
		System.out.println("36.6 C = " + converter.convertCF(36.6) + " F");
		System.out.println("0 K = " + converter.convertKC(0) + " C");
		System.out.println("0 K = " + converter.convertKF(0) + " F");
	}
}