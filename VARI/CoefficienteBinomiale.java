import java.util.*;
import java.io.*;

public class CoefficienteBinomiale {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = insertN(in);
		int k = insertK(n, in);
		
		System.out.println(C(n, k));
		
	}
	
	private static double C(int n, int k) {
		if( k == n || k == 0 ) {
			return 1;
		} else {
			return ( C(n - 1, k - 1) + C(n - 1, k) );
		}
	}
	
	private static int insertN(Scanner in) {
		int n = -1;
		
		while( n < 0 ) {
			try {
				do {
					System.out.print("Inserisci valore: ");
					n = in.nextInt();
				}while( !(n >= 0) );
			}catch( InputMismatchException e ) {
				System.out.println("Errore di inserimento..");
				in.next();
			}
		}
		
		return n;
	}
	
	private static int insertK(int n, Scanner in) {
		int k = -1;
		
		while( k < 0 ) {
			try {
				do {
					System.out.print("Inserisci valore: ");
					k = in.nextInt();
				}while( !(n >= 0 && k <= n) );
			}catch( InputMismatchException e ) {
				System.out.println("Errore di inserimento..");
				in.next();
			}
		}
		
		return k;
	}
}
