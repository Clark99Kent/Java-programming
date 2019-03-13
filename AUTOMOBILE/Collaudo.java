import java.util.*;

public class Collaudo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//CREAZIONE AUTOMOBILI . 
		Auto automobili[] = {
				new Auto("488 GTB", "FERRARI", 20),
				new Auto("PORTOFINO", "FERRARI", 18),
				new Auto("REVENTON", "LAMBORGHINI", 15),
				new Auto("NUOVA 500", "FIAT", 35),
				new Auto("GIULIETTA", "ALFA ROMEO", 28),
				new Auto("SERIE 3", "BMW", 14),
				new Auto("YARIS", "TOYOTA", 34)
		};
		
		//COLLAUDO .
		boolean bool = true;
		while( bool ) {
			menu(automobili);
			
			int scelta = 0;
			switch( controlloScelta(scelta, 8) ) {
				case 0: 
					bool = false;
				break;
				
				case 1: 
					System.out.println("AUTO? ");
					scelta = controlloScelta(scelta, automobili.length);
					
					System.out.print("QUANTO RIFORNIMENTO EFFETTUARE?: ");
					float rifornimento = in.nextFloat();
					
					automobili[scelta].setRifornimento(rifornimento);
				break;
				
				case 2: 
					System.out.println("AUTO? ");
					scelta = controlloScelta(scelta, automobili.length);
					
					System.out.print("NUOVO MODELLO: ");
					String nome = in.next();
					automobili[scelta].setNome(nome);
				break;
				
				case 3: 
					System.out.println("AUTO? ");
					scelta = controlloScelta(scelta, automobili.length);
					
					System.out.print("NUOVA RESA: ");
					automobili[scelta].setResa(scelta = in.nextInt());
				break;
					
				case 4:
					System.out.println("AUTO? ");
					scelta = controlloScelta(scelta, automobili.length);
					
					System.out.print("NUOVA MARCA: ");
					String marca = in.next();
					automobili[scelta].setMarca(marca);
				break;
					
				case 5:
					System.out.println("AUTO? ");
					
					System.out.println(automobili[controlloScelta(scelta, automobili.length)].getCarburante());
				break;
				
				case 6:
					System.out.println("AUTO");
					
					stampaAuto(automobili);
				break;
				
				case 7:
					System.out.println("AUTO? ");
					scelta = controlloScelta(scelta, automobili.length);
					
					System.out.print("KM DA PERCORRERE: ");
					float km = in.nextFloat();
					automobili[scelta].setGuida(km);
				break;
				
				default:
					System.out.println("ERRORE!!");
			}
			
		}
	}
	
	public static void menu(Auto[] auto) {
		System.out.println("\t\t*************************************************");
		System.out.println("\t\t*         0. EXIT                               *");
		System.out.println("\t\t*         1. FARE RIFORNIMENTO                  *");
		System.out.println("\t\t*         2. CAMBIARE MODELLO DI AUTO (Nome)    *");
		System.out.println("\t\t*         3. CAMBIARE RESA AUTO                 *");
		System.out.println("\t\t*         4. CAMBIARE MARCA AUTO (Marca)        *");
		System.out.println("\t\t*         5. STAMPARE QUANTITA' CARBURANTE      *");
		System.out.println("\t\t*         6. STAMPARE AUTO MODIFICATE           *");
		System.out.println("\t\t*         7. KM PERCORSI                        *");
		System.out.println("\t\t*************************************************");
		System.out.println();
		
		System.out.println("AUTO DISBONIBILI: ");
		stampaAuto(auto);
	}
	
	public static void stampaAuto(Auto[] auto) {
		for( int i = 0; i < auto.length; i++ ) {
			System.out.println(i + ". Modello: " + auto[i].getNome() + " -  Marca: " + auto[i].getMarca() + " -  Resa: " + auto[i].getResa());
		}
		System.out.println();
	}
	
	public static int controlloScelta(int scelta, int indexTwo) {
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("INSERISCI: ");
			scelta = in.nextInt();
			
		} while( !( scelta > -1 && scelta < indexTwo ) );
		
		return scelta;
	}

}
