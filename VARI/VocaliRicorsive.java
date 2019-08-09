import java.util.*;
import java.io.*;

public class VocaliRicorsive {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String parola = in.nextLine();
		char[] frase = parola.toCharArray();
		int cont = 0;
		
		System.out.println("IL NUMERO DI VOCALI PRESENTE NELLA FRASE E': " + contaRicorsiva(frase, parola.length() - 1, cont));
	}
	
	public static int contaRicorsiva(char[] frase, int n, int cont) {
		if( n == 0 ) {
			return cont;
		} else 
			if( frase[n] == ('A') || frase[n] == ('a') ||
				frase[n] == ('E') || frase[n] == ('e') ||
				frase[n] == ('I') || frase[n] == ('i') ||
				frase[n] == ('O') || frase[n] == ('o') ||
				frase[n] == ('U') || frase[n] == ('u') ) {
				cont++;
				return contaRicorsiva(frase, n - 1, cont);
			} else {
				return contaRicorsiva(frase, n - 1, cont);
			}
	}
}