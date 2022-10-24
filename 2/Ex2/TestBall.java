public class TestBall {
	public static void main(String[] args) {
		Ball basketball = new Ball(0, 0);
		System.out.println(basketball.toString());
		basketball.setY(100.001);
		basketball.setX(-10.10);
		System.out.println(basketball.toString());
	}

}