package Poslasticarnica;

public class Stavka {

	private String naziv;
	private double cena;
	private boolean dostupno;
	
	
	public Stavka(String naziv,double cena,boolean dostupno) {
		this.naziv = naziv;
		this.cena = cena;
		this.dostupno = dostupno;
	}
	
	
	public void promeniCenu(double novaCena) {
		cena = novaCena;
	}
	
	public void postaviDostupno() {
		dostupno = true;
	}
	
	public void postaviNeDostupno() {
		dostupno = false;
	}
	
	public String dohvatiNaziv() {
		return naziv;
	}
	
	public double dohvatiCenu() {
		return cena;
	}
	
	public boolean dohvatiDostupno() {
		return dostupno;
	}


	public String toString() {
		String st= "Naziv: " + naziv; st += "\nCena: " + cena;
		if (dostupno== true) st+= "\nDostupna je.";
		else st+= "\nNedostupna je.";
		return st;
	}
	
	
}
