public class Giocatore {

	private String nome;
	private String cognome;
	private int numeroMaglia;
	private String squadra;
	private int goalSegnati;
	
	public Giocatore(String nome, String cognome, int numeroMaglia, String squadra) {
		this.nome = nome;
		this.cognome = cognome;
		this.numeroMaglia = numeroMaglia;
		this.squadra = squadra;
		this.goalSegnati = 0;
	}
	
	//METODI GET . 
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public int getNumeroMaglia() {
		return numeroMaglia;
	}
	
	public String getSquadra() {
		return squadra;
	}
	
	public int getGoalSegnati() {
		return goalSegnati;
	}
	
	//METODI SET . 
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setNumeroMaglia(int numeroMaglia) {
		this.numeroMaglia = numeroMaglia;
	}
	
	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}
	
	public void setGoalSegnati(int goalSegnati) {
		this.goalSegnati = goalSegnati;
	}
}