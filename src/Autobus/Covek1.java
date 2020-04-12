package Autobus;

public class Covek1 {
	/*Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta. 
	 * Svi podaci mogu da se dohvate, ali ne i postave.*/
	
	private String ime;
	private String prezime;
	
	public Covek1(String ime,String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}
	
	
	
}
