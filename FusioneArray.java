import java.util.Scanner;

public class FusioneArray {
    
    public static int Grandezza( int n ) {
        Scanner in = new Scanner ( System.in );
        do {
            System.out.print("Inserisci grandezza array: ");
            n = in.nextInt();
        } while ( !( n > 0) );
        
        return n;
    }
    
    public static void Controllo( int[] v, int[] z, Counter c, int n ) {
        boolean bool = false;
        
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < c.var; j++ ) {
                if ( v[i] == z[j] ) {
                    bool = true;
                }
            }
            
            if ( !bool ) {
                z[c.var] = v[i];
                c.var++;
            }
            bool = false;
            }
    }
    
    public static void StampaArray( int[] z, Counter c ) {
        for ( int i = 0; i < c.var; i++ ) {
            System.out.print(z[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );
        Counter c = new Counter();
        
        //DICHIARAZIONE VARIABILI . 
        
        int n = 0, m = 0;
        
        n = Grandezza(n);
        m = Grandezza(m);
        
        //DICHIARAZIONE VETTORI . 
        
        int[] v = new int[n];
        int[] w = new int[m];
        int[] z = new int[n + m];
        
        //CARICAMENTO PRIMO VETTORE . 
        
        for ( int i = 0; i < v.length; i++ ) {
            System.out.print("Inserisci valore in posizione " + i + ": ");
            v[i] = in.nextInt();
        }
        
        //CARICAMENTO SECONDO VETTORE . 
        
        for ( int i = 0; i < w.length; i++ ) {
            System.out.print("Inserisci valore in posizione " + i + ": ");
            w[i] = in.nextInt();
        }
        
        //CREAZIONE TERZO VETTORE . 
        
        Controllo(v, z, c, n);
        Controllo(w, z, c, m);
        
        //STAMPA TERZO VETTORE . 
        StampaArray(z, c);
    }
}