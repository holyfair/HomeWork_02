
public class Oval extends Shape{

	private Point point;
	private double diametr;
	
	public Oval() {
		super();
	}
   
	public Oval(Point point, double diametr) {
		super();
		this.point = point;
		this.diametr = diametr;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public double getDiametr() {
		return diametr;
	}

	public void setDiametr(double diametr) {
		this.diametr = diametr;
	}

	@Override
	double getPerimetr() {
		return Math.PI * diametr;
	}

	@Override
	double getArea() {
		return Math.PI * Math.pow(diametr / 2, 2);
	}

	@Override
	public String toString() {
		return "Oval [point=" + point + ", diametr=" + diametr + "]";
	}

	
}
