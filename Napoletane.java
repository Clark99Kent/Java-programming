/*Creare un programma che permetta di estrarre in modo casuale una o più carte napoletane
  tenendo conto che dopo la prima estrazione la carta sarà inserita nuovamente nel mazzo.
  Inoltre generare un contatore che permetta di contare quante volte uscirà un determinato
  seme(ES: SPADE è uscito 2 volte, COPPE è uscito 11 volte).
*/

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;
import java.io.*;

public class Napoletane {
	public static void main(String[] args) {
		System.out.println("\t\t\t\t\t\t\t**********************************");
		System.out.println("\t\t\t\t\t\t\t* Estrattore di carte napoletane *");
		System.out.println("\t\t\t\t\t\t\t**********************************");
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		Random rand = new Random();
		int card;
		int symbol;
		int n, semeCount = 0;
		int seed;

		System.out.print("Inserisci il numero di carte da estrarre: ");
		n = in.nextInt();
		System.out.println();

		System.out.println("*********************************");
		System.out.println("* 1 - SPADE                     *");
		System.out.println("* 2 - BASTONI                   *");
		System.out.println("* 3 - DENARI                    *");
		System.out.println("* 4 - COPPE                     *");
		System.out.println("*********************************");


		do {
			System.out.print("Inserisci il seme che vuoi contare: ");
			seed = in.nextInt();
		} while (!(seed > 0 && seed < 5));

		for (int i = 0; i < n; i++) {

			card = rand.nextInt(10) + 1;
			System.out.println(card);

			symbol = rand.nextInt(4) + 1;

			switch (card) {
				case 1:
					System.out.print("La carta estratta è: ASSO di ");
				break;

				case 2:
					System.out.print("La carta estratta è: DUE di ");
				break;

				case 3:
					System.out.print("La carta estratta è: TRE di ");
				break;

				case 4:
					System.out.print("La carta estratta è: QUATTRO di ");
				break;

				case 5:
					System.out.print("La carta estratta è: CINQUE di ");
				break;

				case 6:
					System.out.print("La carta estratta è: SEI di ");
				break;

				case 7:
					System.out.print("La carta estratta è: SETTE di ");
				break;

				case 8:
					System.out.print("La carta estratta è: DONNA di ");
				break;

				case 9:
					System.out.print("La carta estratta è: CAVALLO di ");
				break;

				case 10:
					System.out.print("La carta estratta è: RE di ");
				break;

				default: System.out.println("ERRORE!!!!!");
				break;
			}

			switch (symbol) {
				case 1:
					System.out.println("SPADE ");
					System.out.println();
				break;

				case 2:
					System.out.println("BASTONI ");
					System.out.println();
				break;

				case 3:
					System.out.println("DENARI ");
					System.out.println();
				break;

				case 4:
					System.out.println("COPPE ");
					System.out.println();
				break;

				default: System.out.println("ERRORE!!!!!");
				break;
			}
			if(symbol == seed) {
				semeCount++;
			}
		}

		if (seed == 1)
			System.out.println("Il seme di SPADE è uscito " + semeCount + " volte");
		if (seed == 2)
			System.out.println("Il seme di BASTONI è uscito " + semeCount + " volte");
		if (seed == 3)
			System.out.println("Il seme di DENARI è uscito " + semeCount + " volte");
		if (seed == 4)
			System.out.println("Il seme di  COPPE è uscito " + semeCount + " volte");
	}
}
