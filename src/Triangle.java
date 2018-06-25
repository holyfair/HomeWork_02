
public class Triangle extends Shape{

	private Point pointOne;
	private Point pointTwo;
	private Point pointThree;
	
	public Triangle(Point pointOne, Point pointTwo, Point pointThree) {
		super();
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
		this.pointThree = pointThree;
	}

	public Triangle() {
		super();
	}

	
	public Point getPointOne() {
		return pointOne;
	}

	public void setPointOne(Point pointOne) {
		this.pointOne = pointOne;
	}

	public Point getPointTwo() {
		return pointTwo;
	}

	public void setPointTwo(Point pointTwo) {
		this.pointTwo = pointTwo;
	}

	public Point getPointThree() {
		return pointThree;
	}

	public void setPointThree(Point pointThree) {
		this.pointThree = pointThree;
	}

	@Override
	double getPerimetr() {
		double firstSide = Math.sqrt(Math.pow(pointOne.getX() - pointTwo.getX(), 2) + Math.pow(pointOne.getY() -
				pointTwo.getY(), 2));
		double secondSide = Math.sqrt(Math.pow(pointOne.getX() - pointThree.getX(), 2) + Math.pow(pointOne.getY() -
				pointThree.getY(), 2));
		double thirdSide = Math.sqrt(Math.pow(pointTwo.getX() - pointThree.getX(), 2) + Math.pow(pointTwo.getY() -
				pointThree.getY(), 2));
		
		return firstSide + secondSide + thirdSide;
	}

	@Override
	double getArea() {
       
		double Area = Math.abs((pointOne.getX() - pointThree.getX()) * (pointTwo.getY() - pointThree.getY()) -
				(pointOne.getY() - pointThree.getY()) * (pointTwo.getX() - pointThree.getX())) / 2;
		
		return Area;
	}

	@Override
	public String toString() {
		return "Triangle [pointOne=" + pointOne + ", pointTwo=" + pointTwo + ", pointThree=" + pointThree + "]";
	}
    
}
