public class MathFunc implements MathCalculable {
	public double pow(double a, int b) {
		double tempNumber = 1;
		if (b == 0) return 1;
		else if (b > 0) {
			for (int i = 1; i <= b; i++) {
				tempNumber *= a;
			}
			return tempNumber;
		} else {
			for (int i = 1; i <= b * (-1); i++) {
				tempNumber *= a;
			}
			return (double) 1 / tempNumber;
		}
	}

	public double moduleOfComplex(double x, double y) {
		return Math.sqrt((x * x) + (y * y));
	}
/*
	private int indexOf(String str, String subStr, int order) {
		if (order < 1) return -1000000;
		else {
			if (order == 1) return str.indexOf(subStr);
			else {
				int counter = 0;
				for (int i = 1; i < order; i++) {

				}
			}
		}
	}
*/
	public double moduleOfComplex(String x) {
		String firstNumber, secondNumber;
		//System.out.println(x);
		x = x.replace(" ", "");
		x = x.replace("+", " ");
		x = x.replace("-", " -");
		x = x.replace(",", ".");
		x = x.replace("j", "i");
		//System.out.println("pre X = \"" + x + "\"");
		
		if (x.substring(0, 1).equals(" ")) {
			firstNumber = x.substring(1, x.lastIndexOf(" "));
		} else {
			firstNumber = x.substring(0, x.indexOf(" "));
		}

		secondNumber = x.substring(x.lastIndexOf(" ") + 1, x.indexOf("i"));

		//System.out.println("FIRST: |" + firstNumber + "|");
		//System.out.println("SECOND: |" + secondNumber + "|");
		
		return moduleOfComplex(Double.parseDouble(firstNumber), Double.parseDouble(secondNumber));
		

	}

	public static void main(String[] args) {
		MathFunc func = new MathFunc();
		System.out.println("2 ^ 4 = " + func.pow(2, 4));
		System.out.println("2 ^ -4 = " + func.pow(2, -4));
		System.out.println("sqrt(2 ^ 2 + 3 ^ 2) = " + func.moduleOfComplex(2, 3));

		System.out.println("sqrt(2 ^ 2 + 3 ^ 2) = " + func.moduleOfComplex("2 + 3i"));
		
	}
}