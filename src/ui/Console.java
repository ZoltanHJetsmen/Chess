package ui;

import interfaces.Piece;

public class Console {
	
	public static void printBoard(Piece[][] pieces) {
		
		StringBuilder boardPrint = new StringBuilder();
		
		for(int i = 0; i < 8; i++) {
			
			boardPrint.append(8 - i + " ");
			
			for(int j = 0; j < 8; j++) {
				boardPrint.append(pieces[i][j] == null ? "- " : pieces[i][j].toString());
			}
			boardPrint.append("\n");
		}
		
		boardPrint.append(" ");
		
		for(int i = 0; i < 8; i++) 
			//97 = a ASCII
			boardPrint.append(" " + (char)(97 + i));
		
		System.out.println(boardPrint);
	}
	
	public static void cleanConsole() {
		
		System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}
}
