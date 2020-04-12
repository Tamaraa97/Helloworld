package Fakultet;

public class Profesori extends Osobe{
	
	private String temaDr;
	
	public Profesori(String ime,String prezime,String adresa,String jmbg,String brLk,String temaDr) {
		super(ime,prezime,adresa,jmbg,brLk);
		this.temaDr = temaDr;
	}

	public String getTemaDr() {
		return temaDr;
	}
	
	
	
	

}
