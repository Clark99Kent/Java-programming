/*
Scrivere un programma che, dato un array a in input di n elementi, verifichi usando un metodo ricorsivo
se l'array è composto da valori per cui vale la seguente equazione
Per gli elementi con indice i <= 1, nessuna condizione,
per i > 1, a[i] = a[i-1] * a[i-2],

Esempio: se si passasse al metodo l’array sottostante, il metodo dovrebbe restituire un true
		{ 2, 4, 8, 32, 256 }

 */
import java.util.Scanner;

public class MoltiplicazioneRicorsiva {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//CREAZIONE ARRAY .
		int[] v = {2, 4, 8, 32, 256};
		
		//CHIAMATA AL METODO RICORSIVO .
		System.out.println(controllo(v, v.length));
	}
	
	public static boolean controllo(int[] v, int n) {
		if( ( v.length == 2 ) || ( v.length == 0 ) || ( n == 2 ) ) {
			return true;
		}
		else
			if( ( n > 1 ) && (v[n - 1] != v[n - 2] * v[n - 3]) ) {
				return false;
			}
			else {
				return controllo(v, n-1);
			}
	}

}
