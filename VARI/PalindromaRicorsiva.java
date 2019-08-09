import java.util.*;
import java.io.*;

public class PalindromaRicorsiva {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String parola = in.nextLine();
		parola = parola.replaceAll(" ", "");
		char[] frase = parola.toCharArray();
		
		int n = 0;
		int k = 0;
		
		if( parola.length() % 2 == 0 ) {
			n = ( (parola.length() / 2) - 1 );
			k = (parola.length() / 2);
		} else {
			n = ( (parola.length() / 2) - 1 );
			k = ( (parola.length() / 2) + 1 );
		}
		
		if( controlloPalindroma(frase, n, k) )
			System.out.println("PALINDROMA");
		else
			System.out.println("NON PALINDROMA");
		
	}
	
	public static boolean controlloPalindroma(char[] frase, int n, int k) {
		if( n == 0 ) {
			return true;
		} else 
			if( frase[n] == frase[k] ) {
				return controlloPalindroma(frase, n - 1, k + 1);
			} else {
				return false;
			}
	}
}