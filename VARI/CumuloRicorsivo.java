import java.util.*;
import java.io.*;

public class CumuloRicorsivo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] array = new int[] {2, 3, 1, 5, 6, 2, 7};
		
		for( int i = array.length - 1; i >= 0; i-- ) {
			array[i] = sommaRicorsiva(array, i);
		}
		
		
		for( int i = 0; i < array.length; i++ ) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	public static int sommaRicorsiva(int[] array, int n) {
		if( n == 0 ) {
			return array[0];
		} else {
			return array[n] + sommaRicorsiva(array, n - 1);
		}
	}
}
