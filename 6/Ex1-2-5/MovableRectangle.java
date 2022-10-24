public class MovableRectangle extends MovablePoint implements Movable {

	MovablePoint topLeft;
	MovablePoint bottomRight;

	MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		super(x1, y1, xSpeed, ySpeed);
		topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	@Override
	public String toString() {
		return "MovableRectangle{x1=" + topLeft.getX() + ", y1=" + topLeft.getY() + ", x2=" + bottomRight.getX() + ", y2=" + bottomRight.getY() + ", xSpeed=" + topLeft.getXSpeed() + ", ySpeed=" + topLeft.getYSpeed() + "}";
	}


	public void moveUp(int pixels) {
		super.moveUp(pixels);
		topLeft.moveUp(pixels);
		bottomRight.moveUp(pixels);
	}

	public void moveDown(int pixels) {
		super.moveDown(pixels);
		topLeft.moveDown(pixels);
		bottomRight.moveDown(pixels);
	}

	public void moveLeft(int pixels) {
		super.moveLeft(pixels);
		topLeft.moveLeft(pixels);
		bottomRight.moveLeft(pixels);
	}

	public void moveRight(int pixels) {
		super.moveRight(pixels);
		topLeft.moveRight(pixels);
		bottomRight.moveRight(pixels);
	}
}