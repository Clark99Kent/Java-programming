/*
Scrivere un programma, che letti in input il numero di righe/colonne di una matrice 
bidimensionale quadrata crei e stampi una matrice i cui elementi formino, se pensati 
come valori di un ipotetico asse z, una piramide (i.e. valore maggiore al centro della
matrice, 0 ai bordi della matrice).

ESEMPIO:
Per una matrice 5x5
0 0 0 0 0
0 1 1 1 0
0 1 2 1 0
0 1 1 1 0
0 0 0 0 0
*/
import java.util.*;
import java.io.*;

public class Piramide {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("************************");
		System.out.println("*       PIRAMIDE       *");
		System.out.println("************************");
		
		//DICHIARAZIONE VARIABILI . 
		boolean bool;
		int n = 0;
		
		//DICHIARAZIONE MATRICE .
		bool = false;
		while ( !bool ) {
			try {
				do {
					System.out.print("Inserisci grandezza matrice quadrata: ");
					n = in.nextInt();
				} while ( !(n > 0 && n % 2 != 0) );
				bool = true;
			}
			catch ( Exception e ) {
				System.out.println("...Errore!!!...");
				String s = in.next();
			}
		}
		
		int mat[][] = new int [n][n];
		
		//SVOLGIMENTO . 
		for ( int i = 0; i < n; i++ ) {
			for ( int j = 0; j < n; j++ ) {
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
		
		//MASSIMO DELLA MATRICE . 
		int max = mat[0][0];
		for ( int i = 0; i < n; i++ ) {
			for ( int j = 0; j < n; j++ ) {
				if ( mat[i][j] > max ) {
					max = mat[i][j];
				}
			}
		}
		
		//STAMPA DELLA MATRICE (PIRAMIDE) . 
		for ( int i = 0; i < n; i++ ) {
			for ( int j = 0; j < n; j++ ) {
				if ( (i == 0) || (j == 0) || (i == (n - 1)) || (j == (n - 1)) )  {
					mat[i][j] = 0;
				}
				else 
					if ( (i <= j) || (j <= i) || (i == j) ) {
						mat[i][j] = 1;
					}
			}
		}
		
		mat[n / 2][n / 2] = max;
		for ( int i = 0; i < n; i++ ) {
			for ( int j = 0; j < n; j++ ) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}