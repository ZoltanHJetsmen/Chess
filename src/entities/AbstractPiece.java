package entities;

import interfaces.Piece;

public abstract class AbstractPiece implements Piece{
	
	private String color;

	public String getColor() {
		return color;
	}

	public AbstractPiece(String color) {
		this.color = color;
	}
	
	public abstract void movement();
}
