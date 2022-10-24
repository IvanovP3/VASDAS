public class Circle {
	private double x, y, r;

	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
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


	@Override
	public String toString() {
		return "Circle{" + "x=" + this.x + ", y=" + this.y + ", r=" + r + "}";
	}

	public double getPerimetr() {
		return Math.PI * this.getR();
	}

	public double getSquare() {
		return Math.PI * this.r * this.r;
	}

	//@Override
	public boolean equals(Circle obj) {
		return this.r == obj.r;
	}


}