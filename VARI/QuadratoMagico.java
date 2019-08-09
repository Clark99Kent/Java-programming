import java.util.*;
import java.io.*;

public class QuadratoMagico {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] quadrato = new int[4][4];
		
		for( int i = 0; i < quadrato.length; i++ ) {
			for( int j = 0; j < quadrato[i].length; j++ ) {
				quadrato[i][j] = in.nextInt();
			}
		}
		
		int sum = 0;
		for( int i = 0; i < quadrato.length; i++ ) {
			sum += quadrato[0][i]; 
		}
		
		boolean flag = true;
		int sumRiga;
		for( int i = 0; i < quadrato.length; i++ ) {
			sumRiga = 0;
			for( int j = 0; j < quadrato[i].length; j++ ) {
				sumRiga += quadrato[i][j];
				System.out.print(quadrato[i][j] + " ");
			}
			System.out.println();
			
			if( sum != sumRiga )
				flag = false;
		}
		
		int sumColonna;
		for( int i = 0; i < quadrato.length; i++ ) {
			sumColonna = 0;
			for( int j = 0; j < quadrato[i].length; j++ ) {
				sumColonna += quadrato[j][i];
				System.out.print(quadrato[j][i] + " ");
			}
			System.out.println();
			
			if( sum != sumColonna )
				flag = false;
		}
		
		if( flag )
			System.out.println("CORRETTO");
		else
			System.out.println("NON CORRETTO");
	}
}