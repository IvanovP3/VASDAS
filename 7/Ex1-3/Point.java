public class Point implements Movable {
	private int x, y;
	Point() {
		this.x = 0;
		this.y = 0;
	}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void moveLeft(int pixels) {
		this.x -= pixels;
	}

	public void moveRight(int pixels) {
		this.x += pixels;
	}

	public void moveUp(int pixels) {
		this.y += pixels;
	}

	public void moveDown(int pixels) {
		this.y -= pixels;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point{x=" + this.x + ", y=" + this.y + "}";
	}
}