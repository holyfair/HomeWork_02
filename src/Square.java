
public class Square extends Shape{

	private Point point;
	private double side;
	
	
	
	public Square(Point point, double side) {
		super();
		this.point = point;
		this.side = side;
	}

	
	public Square() {
		super();
	}


	public Point getPoint() {
		return point;
	}


	public void setPoint(Point point) {
		this.point = point;
	}


	public double getSide() {
		return side;
	}


	public void setSide(double side) {
		this.side = side;
	}


	@Override
	double getPerimetr() {
		return side * 4;
	}

	@Override
	double getArea() {
		return side * side;
	}


	@Override
	public String toString() {
		return "Square [point=" + point + ", side=" + side + "]";
	}

}
