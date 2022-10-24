public class MovableCircle extends MovablePoint implements Movable {

	MovablePoint center;

	MovableCircle(int x, int y, int xSpeed, int ySpeed) {
		super(x, y, xSpeed, ySpeed);
		center = new MovablePoint(x, y, xSpeed, ySpeed);
	}

	@Override
	public String toString() {
		return "MovableCircle{x=" + center.getX() + ", y=" + center.getY() + ", xSpeed=" + center.getXSpeed() + ", ySpeed=" + center.getYSpeed() + "}";
	}


	public void moveUp(int pixels) {
		super.moveUp(pixels);
		center.moveUp(pixels);
	}

	public void moveDown(int pixels) {
		super.moveDown(pixels);
		center.moveDown(pixels);
	}

	public void moveLeft(int pixels) {
		super.moveLeft(pixels);
		center.moveLeft(pixels);
	}

	public void moveRight(int pixels) {
		super.moveRight(pixels);
		center.moveLeft(pixels);
	}
}