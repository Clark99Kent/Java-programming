import java.util.*;
import java.io.*;

public class SequenzaPerfetta {
	public static void main(String[] args) {
		int[] v = new int[] {1, 9, 1, 2, 1, 8, 2, 4, 6, 2, 7, 9, 4, 5, 8, 6, 3, 4, 7, 5, 3, 9, 6, 8, 3, 5, 7};
		int cont;
		
		for( int i = 0; i < v.length; i++ ) {
			cont = 0;
			
			if( v[i] != 0 ) {
				int n = i;
				for( int j = 0; j < v.length; j++ ) {
					if( (v[i] == v[j]) && ((j - n) == v[i] + 1) || (v[i] == v[j]) && ((j - i) == 0) ) {
						n = j;
						cont++;
					}
				}
				
				
				if( cont == 3 ) {
					int temp = v[i];
					for( int k = 0; k < v.length; k++ ) {
						if( temp == v[k] ) {
							v[k] = 0;
						}
					}
					v[i] = 0;
				}
			}
		}
		
		int sum = 0;
		for( int i = 0; i < v.length; i++ ) {
			sum += v[i];
		}
		
		if( sum == 0 )
			System.out.println("SEQUENZA PERFETTA");
	}
}