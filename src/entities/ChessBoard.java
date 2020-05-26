package entities;

import interfaces.*;

public class ChessBoard implements Board{

	Piece[][] board = new Piece[8][8];
	
	public ChessBoard() {
		
		
		board[0][0] = new Rook("BLACK");
		board[0][1] = new Knight("BLACK");
		board[0][2] = new Bishop("BLACK");
		board[0][3] = new Queen("BLACK");
		board[0][4] = new King("BLACK");
		board[0][5] = new Bishop("BLACK");
		board[0][6] = new Knight("BLACK");
		board[0][7] = new Rook("BLACK");
		
		board[1][0] = new Pawn("BLACK");
		board[1][1] = new Pawn("BLACK");
		board[1][2] = new Pawn("BLACK");
		board[1][3] = new Pawn("BLACK");
		board[1][4] = new Pawn("BLACK");
		board[1][5] = new Pawn("BLACK");
		board[1][6] = new Pawn("BLACK");
		board[1][7] = new Pawn("BLACK");
		
		board[7][0] = new Rook("WHITE");
		board[7][1] = new Knight("WHITE");
		board[7][2] = new Bishop("WHITE");
		board[7][3] = new Queen("WHITE");
		board[7][4] = new King("WHITE");
		board[7][5] = new Bishop("WHITE");
		board[7][6] = new Knight("WHITE");
		board[7][7] = new Rook("WHITE");
		
		board[6][0] = new Pawn("WHITE");
		board[6][1] = new Pawn("WHITE");
		board[6][2] = new Pawn("WHITE");
		board[6][3] = new Pawn("WHITE");
		board[6][4] = new Pawn("WHITE");
		board[6][5] = new Pawn("WHITE");
		board[6][6] = new Pawn("WHITE");
		board[6][7] = new Pawn("WHITE");
	}

	public Piece[][] getboard() {
		return board;
	}
	
	public void movePiece(int x1, int y1, int x2, int y2) {
	
		board[x2][y2] = board[x1][y1];
		board[x1][y1] = null;
	}
	
}

