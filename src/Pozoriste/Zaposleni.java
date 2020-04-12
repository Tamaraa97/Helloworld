package Pozoriste;

public class Zaposleni{

	/*Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje)
	 *  i pozoristem u kojem je zaposlen. 
	 *  Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista]. */
	
	private String imeIPrezime;
	private Pozoriste pozoriste;
	
	public Zaposleni(String imeIPrezime,Pozoriste pozoriste ) {
		this.imeIPrezime = imeIPrezime;
		this.pozoriste = pozoriste;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}
	
	public String toString() {
		return imeIPrezime+"["+ pozoriste.getNaziv()+"]";
	}
}
