package Fakultet;

public class Studenti extends Osobe{
	private int brIndeksa;
	private int godina;
	
	public Studenti(String ime,String prezime,String adresa,String jmbg,String brLk,int brIndeksa,int godina) {
		super(ime,prezime,adresa,jmbg,brLk);
		this.brIndeksa = brIndeksa;
		this.godina = godina;
	}

	public int getBrIndeksa() {
		return brIndeksa;
	}

	public int getGodina() {
		return godina;
	}
	
	

}
