package interfaces;

public interface Board {

	public Piece[][] getboard(); 

	public void movePiece(int x1, int y1, int x2, int y2);
}
