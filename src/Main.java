
public class Main {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 3), new Point(4, 0));
		Oval oval = new Oval(new Point(0, 0), 8);
		Square square = new Square(new Point(0, 0), 4);
		Board board = new Board();
		board.addShape(triangle, 0);
		board.addShape(oval, 2);
		board.addShape(square, 3);
		
		System.out.println(triangle.getArea());
		System.out.println(triangle.getPerimetr());
		System.out.println(triangle);
		System.out.println(oval.getArea());
		System.out.println(oval.getPerimetr());
		System.out.println(oval);
		System.out.println(square.getArea());
		System.out.println(square.getPerimetr());
		System.out.println(square);
		System.out.println(board);
	}
}
