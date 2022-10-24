public class MovablePoint implements Movable {
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;



	MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}


	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int getXSpeed() {
		return this.xSpeed;
	}

	public int getYSpeed() {
		return this.ySpeed;
	}


	@Override
	public String toString() {
		return "MovablePoint{x=" + this.x + ", y=" + this.y + ", xSpeed=" + this.xSpeed + ", ySpeed=" + this.ySpeed + "}";
	}

	public void moveUp(int pixels) {
		this.y += pixels;
	}

	public void moveDown(int pixels) {
		this.y -= pixels;
	}

	public void moveLeft(int pixels) {
		this.x -= pixels;
	}

	public void moveRight(int pixels) {
		this.x += pixels;
	}
}