package itbootcamp.vezbe;

public class Autor {

/*Knjiga poseduje naziv,
 *  AUTORA(TIPA Autor),
 *  broj strana i godinu izdanja.
 *  Sva polja mogu da se dohvate,a godina izdanja moze i da se postavi
 */
	
	/* Knjiga poseduje naziv ,AUTORA(tipa autor),broj strana,godina izdanja
	 * Sva polja mogu da se dohvate,a godina izdanja moze i da se postavi
	 *  */ 
	private String ime1;
	private String prezime1;
	private int godiste1;
	
	public Autor(String ime1,String prezime1,int godiste1) {
		this.ime1 = ime1;
		this.prezime1 = prezime1;
		this.godiste1 = godiste1;
	}

	public String getIme1() {
		return ime1;
	}

	public String getPrezime1() {
		return prezime1;
	}

	public int getGodiste1() {
		return godiste1;
	}
	
	public String ispis() {
		return ime1+" "+prezime1+" ("+godiste1+")";
	}

	@Override
	public String toString() {
		return "Autor [ime1=" + ime1 + ", prezime1=" + prezime1 + ", godiste1=" + godiste1 + "]";
	}
	
	
}
