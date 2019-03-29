/* 
Scrivere un programma che dato in input un array x, crei un array y in cui vengono 
memorizzate le somme parziali degli elementi di x, fino all'indice considerato

ESEMPIO:
se x = [ 1 2 3 4 ] allora y = [ 1 3 6 10 ]
*/

import java.util.*;
import java.io.*;

public class SommeParziali {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//DICHIARAZIONE VARIABILI . 
		int n;
		
		//INSERIMENTO GRANDEZZA ARRAY MONODIMENSIONALE .
		do {
			System.out.print("Inserisci grandezza array: ");
			n = in.nextInt();
		} while ( !(n > 0) );
		
		//DICHIARAZIONE ARRAY MONODIMENSIONALI . 
		int x [] = new int [n];
		int y [] = new int [n];
		
		//RIEMPIMENTO PRIMO ARRAY MONODIMENSIONALE . 
		for ( int i = 0; i < n; i++ ) {
			System.out.print("Inserisci il valore in posizione " + i + ": ");
			x[i] = in.nextInt();
		}
		
		//COSTRUZIONE SECONDO ARRAY MONODIMENSIONALE . 
		for ( int i = 0; i < n; i++ ) {
			for ( int j = i; j >= 0; j-- ) {
				y[i] += x[j];
			}
		}
		
		//STAMPA DEGLI ARRAY MONODIMENSIONALI . 
		System.out.println("Primo Array: ");
		for ( int i = 0; i < n; i++ ) {
			System.out.print(x[i] + " ");
		}
		
		System.out.println();
		System.out.println("Secondo Array: ");
		for ( int i = 0; i < n; i++ ) {
			System.out.print(y[i] + " ");
		}
		
	}

}
