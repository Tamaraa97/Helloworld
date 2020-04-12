package Fakultet;

public class Osobe {
	
	private String ime;
	private String prezime;
	private String adresa;
	private String jmbg;
	private String brLk;
	
	public Osobe(String ime,String prezime,String adresa,String jmbg,String brLk) {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.jmbg = jmbg;
		this.brLk = brLk;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getAdresa() {
		return adresa;
	}

	public String getJmbg() {
		return jmbg;
	}

	public String getBrLk() {
		return brLk;
	}
	
	

}
