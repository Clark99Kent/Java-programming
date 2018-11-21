/*
Dopo aver inserito un valore N, stampare a video una piramide che abbia come cornice più esterna
dei valori pari a 0 e ad ogni scalino più interno, stampare un'ulteriore cornice, che abbia 
il valore della cornice precedente incrementata di 1.

ESEMPIO:

0	0	0	0	0	0	0

0	1	1	1	1	1	0

0	1	2	2	2	1	0

0	1	2	3	2	1	0

0	1	2	2	2	1	0

0	1	1	1	1	1	0

0	0	0	0	0	0	0
*/
import java.util.Scanner;

public class NewPiramide {
	
	private static int newNumber(int n) {
		Scanner in = new Scanner(System.in);
		
		boolean bool = false;
		while ( !bool ) {
			try {
				do {
					System.out.print("Inserisci numero: ");
					n = in.nextInt();
				} while ( !(n > 0 && n % 2 != 0) );
				bool = true;
			} catch ( Exception e ) {
				System.out.println("...Errore!!!...");
				String s = in.next();
			}
		}
		return n;
	}
	
	private static void stampaMatrice ( int[][] m ) {
		for ( int i = 0; i < m.length; i++ ) {
			for ( int j = 0; j < m.length; j++ ) {
				System.out.print(m[i][j] + "  "); 
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//VARIABILI .
		int dim = 0;
		dim = newNumber(dim);
		
		//DICHIARAZIONE MATRICE . 
		int[][] mat = new int[dim][dim];
		
		//CREAZIONE PIRAMIDE . 
		int cont = -1;
		for ( int i = 0; i < dim; i++ ) {
			for ( int j = 0; j < dim; j++ ) {
				if ( i == j ) {
					cont++;
					for ( int k = cont; k < dim - cont; k++ ) {
						for ( int y = cont; y < dim - cont; y++ ) {
							mat[k][y] = cont;
						}
					}
					
				}
			}
		}
		stampaMatrice(mat);
	}
}

