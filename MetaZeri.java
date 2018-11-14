import java.util.*;
import java.io.*;

public class MetaZeri {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("*********************************************************");
		System.out.println("* MATRICE CON META' ZERI E DIAGONALE DI VALORI PARI AD 1*");
		System.out.println("*********************************************************");

		//DICHIARAZIONE VARIABILI .
		int n = 0;
		boolean bool;

		//DICHIARAZIONE MATRICE .
		bool = false;
		while ( !bool ) {
			try {
				do {
					System.out.print("Inserisci grandezza matrice quadrata: ");
					n = in.nextInt();
				} while ( !(n > 0) );
				bool = true;
			}
			catch ( Exception e ) {
				System.out.println("...Errore di inserimento!!!...");
				String s = in.next();
			}
		}

		int mat[][] = new int [n][n];

		//CARICAMENTO MATRICE .
		for ( int i = 0; i < n; i++ ) {
			for ( int j = 0; j < n; j++ ) {
				if ( i < j ) {
					mat[i][j] = 0;
				}
				else
					if ( i == j ) {
						mat[i][j] = 1;
		 			}
					else {
						bool = false;
						while ( !bool ) {
							try {
								do {
									System.out.print("Inserisci valore in posizione " + i + "," + j + ": ");
									mat[i][j] = in.nextInt();
								} while ( !( mat[i][j] > 1 && mat[i][j] < 10) );
								bool = true;
							}
							catch ( Exception e ) {
								System.out.println("...Errore di inserimento!!!...");
								String ss = in.next();
							}
						}
					}
			}
		}

		//STAMPA MATRICE .
		for ( int i = 0; i < n; i++ ) {
			for ( int j = 0; j < n; j++ ) {
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
