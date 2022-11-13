public class Test{
	public static void main(String[] args) {
		MovableRectangle rectangle = new MovableRectangle(0, 2, 2, 2);
		System.out.println("before moving: " + rectangle.toString());
		rectangle.moveRight(10);
		System.out.println("after moving right (10): " + rectangle.toString());
	}
}