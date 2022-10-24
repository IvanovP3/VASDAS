public class ReverseArray {
		public static void main(String[] args) {
				String [] array = {"g", "f", "e", "d", "c", "b", "a"};

				for (int i = 0; i < array.length / 2; i++) {
					String tempString = array[i];
					array[i] = array[array.length - i -1];
					array[array.length - i - 1] = tempString;
				}





				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i]);
				}
				
		}
}