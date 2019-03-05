/*
Progettare e realizzare una classe Automobile con le proprietà seguenti. Un'automobile ha una determinata resa del carburante misurata 
in km/litro e una certa quantità di carburante nel serbatoio. 
La resa è specificata dal costruttore e il livello iniziale del carburante è zero. Fornire questi metodi:
 - un metodo guida() per simulare il percorso di un'automobile per una certa distanza, riducendo il livello del carburante nel serbatoio
 - un metodo getCarburante() per ispezionare il livello corrente del carburante
 - un metodo rifornimento() per inserire carburante nel serbatoio
Esempio di utilizzo:
 Automobile auto = new Automobile(); 
 auto.setResa(15); // 15 km per litro
 auto.rifornimento(40); // inserisce 40 litri nel serbatoio
 auto.guida(100); // guida per 100 km
 double carburanteRimasto = auto.getCarburante(); // quantità di carburante rimasto
 */
 
 public class Auto {
	
	private String nome;
	private String marca;
	private float resa;
	private float carburante;
	
	public Auto(String nome, String marca, float resa) {
		this.nome = nome;
		this.marca = marca;
		this.resa = resa;
		this.carburante = 0;
	}
	
	
	//METODI GET .
	public String getNome() {
		return nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public float getResa() {
		return resa;
	}
	
	public float getCarburante() {
		return carburante;
	}
	
	
	//METODI SET . 
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setResa(float resa) {
		this.resa = resa;
	}
	
	public void setRifornimento(float rifornimento) {
		this.carburante += rifornimento;
	}
	
	public void setGuida(float km) {
		if( (this.carburante - (km / resa) > 0) )
			this.carburante -= (km / resa);	
		else
			System.out.println("L'AUTO NON POTRA' PERCORRERE " + km + " km");
	}
}



//-------------------------------------------------------------------------------------------------------------------------------



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
