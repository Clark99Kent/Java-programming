/*
Leggere da file un numero qualsiasi di calciatori (nome, cognome, numero maglia, squadra), registrarli in una lista e ordinare la lista
in base al numero di goal segnati, cosi da stilare una classifica marcatori.
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Campionato {
	
	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(new File("Giocatori.txt"));
			ArrayList <Giocatore> giocatori = new ArrayList <Giocatore>();
			
			int i = 0;
			while(in.hasNext()) {
				giocatori.add( new Giocatore(in.next(), in.next(), in.nextInt(), in.next()) );
			}
			caricamentoGoal(giocatori);
			classificaMarcatori(giocatori);
			
			
		} catch( FileNotFoundException e ) {
			System.out.println("FILE NON PRESENTE!!");
		}
	}
	
	public static void caricamentoGoal(ArrayList <Giocatore> giocatori) {
		Scanner in = new Scanner(System.in);
		
		for( int i = 0; i < giocatori.size(); i++ ) {
			System.out.print("QUANTI GOAL HA SEGNATO " + giocatori.get(i).getNome() + " " + giocatori.get(i).getCognome() + " ? ");
			giocatori.get(i).setGoalSegnati(in.nextInt());
		}
	}
	
	public static void classificaMarcatori(ArrayList <Giocatore> giocatori) {
		System.out.println("***************************************");
		System.out.println("*     CLASSIFICA MARCATORI SERIE A    *");  
		System.out.println("***************************************");
		
		for( int i = 0; i < giocatori.size(); i++ ) {
			for( int j = i + 1; j < giocatori.size(); j++ ) {
				if( giocatori.get(i).getGoalSegnati() < giocatori.get(j).getGoalSegnati() ) {
					Giocatore temp = giocatori.get(i);
					giocatori.set(i, giocatori.get(j));
					giocatori.set(j, temp);
				}
			} 
		}
		
		for( int i = 0; i < giocatori.size(); i++ ) 
			System.out.println(giocatori.get(i).getNome() + " " + giocatori.get(i).getCognome() + " " + giocatori.get(i).getGoalSegnati());
	}
}