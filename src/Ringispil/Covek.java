package Ringispil;

public class Covek {
	/*Covek poseduje naziv i novac(d,o/get),Naziv se postavlja prilikom kreiranja i moze da se dohvati.
	 * Novac moze da se doda i oduzme */
	
	private String naziv;
	private int novac;
	
	public Covek(String naziv) {
		this.naziv = naziv;
		novac = 0;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getNovac() {
		return novac;
	}
	
	public void dodajNovac(int iznos) {
		if(iznos>0)
			novac = novac+iznos;
	}
	
	public boolean uzmiNovac(int iznos) {
		if(iznos >0 && iznos<=novac) {
			novac = novac-iznos;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return naziv+""+novac;
	}

}
