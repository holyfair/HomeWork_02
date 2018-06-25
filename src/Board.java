import java.util.Arrays;

public class Board {

	private Shape[] board= new Shape[4];
	

	public void addShape(Shape shape, int place) {
		if(place < board.length && place >= 0) {
			board[place] = shape;
		}else {
			throw new NullPointerException ("Place is not exist");
		}
	}
	
	public void removeShape(int place) {
		if(place < board.length && place >= 0) {
			board[place] = null;
		}else {
			throw new NullPointerException ("Place is not exist");
		}
	}

	@Override
	public String toString() {
		double Sum = 0;
		for(int i = 0; i < board.length; i++) {
			if(board[i] != null) {
			Sum += board[i].getArea();
			}
			
		}
		return "Board [board=" + Arrays.toString(board) + "]" + "Sum of areas =: " + Sum;
	}
	
	
}
