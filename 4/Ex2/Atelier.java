import java.util.ArrayList;
public abstract class Atelier extends Clothes implements ManClothing, WomenClothing {
	
	static ArrayList <Clothes> listOfClothes = new ArrayList<Clothes>();
	

	public static void showDressMan(ArrayList<Clothes> list) {
		for (int i = 0; i < list.size(); i++) {
			/*if (list.get(i).getSex() == 1 || list.get(i).getSex() == 3) {
				list.get(i).dressMan();
			}*/
			if (list.get(i) instanceof ManClothing) {
				((ManClothing) list.get(i)).dressMan();
			}
		}
	}

	public static void showDressWomen(ArrayList<Clothes> list) {
		for (int i = 0; i < list.size(); i++) {
			/*if (list.get(i).getSex() == 2 || list.get(i).getSex() == 3) {
				list.get(i).dressWomen();
			}*/
			if (list.get(i) instanceof WomenClothing) {
				((WomenClothing) list.get(i)).dressWomen();
			}

		}
	}

	public static void main(String[] args) {
		listOfClothes.add(new Pants());
		listOfClothes.add(new Tie());
		listOfClothes.add(new TShirt());

		showDressMan(listOfClothes);

		listOfClothes.add(new Skirt());

		showDressWomen(listOfClothes);
	}
}