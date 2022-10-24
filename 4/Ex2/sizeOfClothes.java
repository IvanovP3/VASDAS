public class sizeOfClothes {
	public enum Sizes {
		XXS(32),
		XS(34),
		S(36),
		M(38),
		L(40);
		
		private final int euroSize;
		private Sizes(int euroSize) {
			this.euroSize = euroSize;
		}
		public int getEuroSize() {
 			return this.euroSize;
 		}
 		
 		public String getDescription() {
 			if (this == Sizes.XXS) {
 				return "Kid's size";
 			} else return "Adult's size";
 		}
	}
/*
	public static void season(Season season) {
		switch(season) {
			case Winter:
				System.out.println("I love " + season.toString());
				break;
			case Spring:
				System.out.println("I love " + season.toString());
				break;
			case Summer:
				System.out.println("I love " + season.toString());
				break;
			case Autumn:
				System.out.println("I love " + season.toString());
				break;
		}
	}

	public static void main(String[] args) {
		Season favouriteSeason = Season.Autumn;
		System.out.println("My favourite season is " + favouriteSeason.toString());
		season(favouriteSeason);
		System.out.println("The average temperature is " + favouriteSeason.getAverageTemperature());
		System.out.println(favouriteSeason.getDescription());
		System.out.println();

		for (Season i : Season.values()) {
			System.out.println(i.toString());
			System.out.println("The average temperature is " + i.getAverageTemperature());
			System.out.println(i.getDescription());
			System.out.println();
		}
	}
	*/
}