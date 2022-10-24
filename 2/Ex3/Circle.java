public class Circle {
	private double x, y, r;
	private String colour;

	public Circle(double x, double y, double r, String colour) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.colour = colour;
	}

	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getR() {
		return this.r;
	}

	public void setR(double r) {
		this.r = r;
	}


	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Circle{" + "x=" + this.x + ", y=" + this.y + ", r=" + r + ", colour=\"" + this.colour + "\"}";
	}

	public double getPerimetr() {
		return Math.PI * this.getR();
	}

}