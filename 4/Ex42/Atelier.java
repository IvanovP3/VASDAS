import java.util.ArrayList;
public abstract class Atelier extends Clothes implements ManClothing, WomenClothing {
	
	static ArrayList <Clothes> listOfClothes = new ArrayList<Clothes>();
	

	public static void dressMan(ArrayList<Clothes> list) {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).dressMan();
		}
	}
	public static void dressWomen(ArrayList<Clothes> list) {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).dressWomen();
		}
	}

	public static void main(String[] args) {
		listOfClothes.add(new Pants());
		listOfClothes.add(new Tie());
		listOfClothes.add(new TShirt());

		dressMan(listOfClothes);

		listOfClothes.add(new Skirt());

		dressWomen(listOfClothes);
	}
}