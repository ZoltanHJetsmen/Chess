package application;

import entities.*;
import interfaces.*;
import ui.Console;

public class Program {
	
	public static void main(String[] args) {
		
		Board b = new ChessBoard();
		
		Console.printBoard(b.getboard());
		
		b.movePiece(0, 0, 3, 4);
		
		Console.cleanConsole();
		
		Console.printBoard(b.getboard());
		
		
	}

}
