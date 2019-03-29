/*
* @author  Michael Carchesio
* @version 1.0
* @since   2019-03-29 
*/

import java.util.*;
import java.io.*;
import java.lang.ArrayIndexOutOfBoundsException;

public class Tris {
	
	//COSTANTE . 
	static int MAX = 3;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//DICHIARAZIONE VARIABILI E COSTANTI .
		int cont = 0;
		
		//DICHIARAZIONE MATRICE . 
		String[][] tavolo = new String[MAX][MAX];
		
		//INIZIO GIOCO . 
		System.out.println("***************************************");
		System.out.println("*     BENVENUTO NEL GIOCO DEL TRIS    *");
		System.out.println("***************************************");
		
		for( int i = 0; i < 3; i++ ) {
			for( int j = 0; j < 3; j++ ) 
				tavolo[i][j] = " ";
		}
		
		stampaTavoloDaGioco(tavolo);
		while(stabilisciIlVincitore(tavolo) && cont < 9) {
			
			controlloInserimenti(tavolo, cont);
			
			stampaTavoloDaGioco(tavolo);
			cont++;
		}
	}
	
	public static void stampaTavoloDaGioco(String[][] tavolo) {
		System.out.println(" -------------");
		
		//STAMPA TAVOLO DA GIOCO .
		for( int i = 0; i < MAX; i++ ) {
			for( int j = 0; j < MAX; j++ ) {
				if( ( ( j == (MAX - 1) ) ) )
					System.out.print(" | " + tavolo[i][j] + " | ");
				else
					System.out.print(" | " + tavolo[i][j]);
			}
			
			System.out.println();
			System.out.println(" -------------");
		}
	}
	
	public static boolean stabilisciIlVincitore(String[][] tavolo) {
		if( 
			((tavolo[0][0].equals("X")) && (tavolo[0][1].equals("X")) && (tavolo[0][2].equals("X")) ) || 
			((tavolo[1][0].equals("X")) && (tavolo[1][1].equals("X")) && (tavolo[1][2].equals("X")) ) ||
			((tavolo[2][0].equals("X")) && (tavolo[2][1].equals("X")) && (tavolo[2][2].equals("X")) ) ||
			((tavolo[0][0].equals("X")) && (tavolo[1][1].equals("X")) && (tavolo[2][2].equals("X")) ) ||
			((tavolo[0][2].equals("X")) && (tavolo[1][1].equals("X")) && (tavolo[2][0].equals("X")) ) ||
			((tavolo[0][0].equals("X")) && (tavolo[1][0].equals("X")) && (tavolo[2][0].equals("X")) ) ||
			((tavolo[0][1].equals("X")) && (tavolo[1][1].equals("X")) && (tavolo[2][1].equals("X")) ) ||
			((tavolo[0][2].equals("X")) && (tavolo[1][2].equals("X")) && (tavolo[2][2].equals("X")) ) ||
			
			((tavolo[0][0].equals("O")) && (tavolo[0][1].equals("O")) && (tavolo[0][2].equals("O")) ) || 
			((tavolo[1][0].equals("O")) && (tavolo[1][1].equals("O")) && (tavolo[1][2].equals("O")) ) ||
			((tavolo[2][0].equals("O")) && (tavolo[2][1].equals("O")) && (tavolo[2][2].equals("O")) ) ||
			((tavolo[0][0].equals("O")) && (tavolo[1][1].equals("O")) && (tavolo[2][2].equals("O")) ) ||
			((tavolo[0][2].equals("O")) && (tavolo[1][1].equals("O")) && (tavolo[2][0].equals("O")) ) ||
			((tavolo[0][0].equals("O")) && (tavolo[1][0].equals("O")) && (tavolo[2][0].equals("O")) ) ||
			((tavolo[0][1].equals("O")) && (tavolo[1][1].equals("O")) && (tavolo[2][1].equals("O")) ) ||
			((tavolo[0][2].equals("O")) && (tavolo[1][2].equals("O")) && (tavolo[2][2].equals("O")) )
		)	return false;
		else 
			return true;
	}
	
	public static void controlloInserimenti(String[][] tavolo, int cont) {
		Scanner in = new Scanner(System.in);
		
		int rows, columns;
		boolean bool = true;
		
		while( bool ) {
			
			try {
			
				do {
					System.out.print("INSERISCI NUMERO RIGA: ");
					rows = in.nextInt();
					
					System.out.print("INSERISCI NUMERO COLONNA: ");
					columns = in.nextInt();
					
				} while( !((rows > -1) && (rows < 3)) || !((columns > -1) && (columns < 3)) || (tavolo[rows][columns].equals("X") || tavolo[rows][columns].equals("O")));
				
				if( cont % 2 == 0 )
					tavolo[rows][columns] = "X";
				else
					tavolo[rows][columns] = "O";
		
				bool = false;
				
			} 
			catch(InputMismatchException e) {
				System.out.println("ERRORE DI INSERIMENTO, SI PREGA DI RIPROVARE !!");
				in.next();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ERRORE DI INSERIMENTO, SI PREGA DI RIPROVARE !!");
				in.next();
			}
			
		}
	}
}