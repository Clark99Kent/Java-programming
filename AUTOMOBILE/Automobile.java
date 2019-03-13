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