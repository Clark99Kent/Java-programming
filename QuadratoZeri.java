/*
Realizzare un programma che stampi una matrice quadrata (N x N) avente come cornice tutti 0 (Zero).
Inoltre l'utente dovrà inserire dei valori compresi tra 1 e 10 (Tutti positivi); visualizzandoli infine all'interno 
della cornice di 0.

Esempio:
	Matrice: 4 x 4

	 0  0  0  0

        0  1  9  0

        0  3  6  0

        0  0  0  0
*/

import java.util.*;
import java.io.*;

public class QuadratoZeri {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//Stampa esercizio . 
		System.out.println("\t\t\t\t\t\t\t\t********************");
		System.out.println("\t\t\t\t\t\t\t\t* Quadrato di zeri *");
		System.out.println("\t\t\t\t\t\t\t\t********************");
		//Dichiarazione variabili .
		int n;
		boolean bool;

		//Inserimento grandezza matrice .
		do {
			System.out.print("Inserisci grandezza matrice: ");
			n = in.nextInt();
		} while ( !(n > 0));

		//Dichiarazione matrice .
		int mat[][] = new int[n][n];

		//Risoluzione .
		for ( int i = 0; i < n; i++ ) {
			for ( int j = 0; j < n; j++ ) {
				if( (i == 0) || (j == 0) || ( i == (n - 1)) || ( j == (n - 1)) ) {
					mat[i][j] = 0;
				}
				else {
						bool = false;
						while ( !bool ){
							try {
								do {
									System.out.print("Inserisci valore nella posizione " + i + "," + j + ": ");
									mat[i][j] = in.nextInt();
								} while ( !(mat[i][j] > 0 && mat[i][j] < 10));
								bool = true;
							}
							catch ( InputMismatchException e) {
								System.out.println("Error !!...");
								String s = in.next();
							}
						} 
				}
			}
		}


		//Stampa matrice .
		for ( int i = 0; i < n; i++ ) {
			for ( int j = 0; j < n; j++ ) {
				System.out.print(mat[i][j] + "   ");
			}
			System.out.println();
		}

	}
}
