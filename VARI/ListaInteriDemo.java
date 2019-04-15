import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.InputMismatchException;

public class ListaInteriDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList <Integer> lista = new LinkedList <Integer>();
		
		boolean bool = true;
		int temp;
		
		while( bool ) {
			try {
				do {
					System.out.print("INSERISCI UN VALORE (0 exit): ");
					temp = in.nextInt();
					if( temp > 0 )
						lista.add(temp);
				}while( !(temp == 0));
				
				bool = false;
			} catch (InputMismatchException e) {
				System.out.println("ERRORE IN INSERIMENTO");
				in.next();
			}
		}
		
		System.out.println("NELLA LISTA CI SONO " + contaPari(lista) + " NUMERI PARI");
		System.out.println("LISTA DEI NUMERI DISPARI STAMPATI AL CONTRARIO: " + contaDispari(lista));
	}
	
	public static int contaPari(List <Integer> l) {
		int cont = 0;
		
		for( int i = 0; i < l.size(); i++ ) {
			if( l.get(i) % 2 == 0 )
				cont++;
		}
		
		return cont;
	}
	
	public static LinkedList <Integer> contaDispari(List <Integer> l) {
		for( int i = 0; i < l.size(); i++ ) {
			if( l.get(i) % 2 == 0 ) {
				l.remove(i);
				i--;
			}
		}
		
		LinkedList <Integer> lista = new LinkedList <Integer>();
		
		for( int i = l.size() -1; i > -1; i-- )
			lista.add(l.get(i));
		
		return lista;
	}

}
