public class ProcessStrings implements StrAble {

	public int countOfSymbolsInStr(String str, String substr) {
		int counter = 0;
		int emergencyCounter = 0;
		boolean key = true;
		String tempStr;
		if (!str.contains(substr)) {
			System.out.println("ERROR: not found substr in str!");
			return 0;
		} else {
			tempStr = str;
			while (key) {
				emergencyCounter++;
				if (emergencyCounter >= 1000) {
					System.out.println("ERROR IN ALGORYTHM! Processor protection system STOPPED while cycle!");
					key = false;
					break;
				}

				if (tempStr.contains(substr)) {
					counter++;
					tempStr = tempStr.substring(tempStr.indexOf(substr) + 1);
				} else {
					key = false;
					return counter;
				}
			}
		}

		return 0;

	}

	public String convertStr(String str) {
		String newStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			newStr = newStr + str.charAt(i);
		}

		return newStr;
	}

	public String getOddSymbols(String str) {
		String newStr = "";
		for (int i = 1; i < str.length(); i++) {
			if (i % 2 == 1) {
				newStr = newStr + str.charAt(i);
			}
		}

		return newStr;
	}


	public static void main(String[] args) {
		ProcessStrings a = new ProcessStrings();
		System.out.println(a.countOfSymbolsInStr(" a ma in lamomalompour", "ma"));
		System.out.println(a.convertStr("privet"));
		System.out.println(a.getOddSymbols("0123456789"));
	}
}