package Dete;

public class Dete {
	/*Dete ima ime, prezime, broj godina i broj klikera. 
	Napraviti mogucnost da se kreira vise objekata klase Dete. Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se azurira.*/
	
	private String ime;
	private String prezime;
	private int brGod;
	private  static int brKlikera;
	
	/*metodu koja ispisuje prosecan broj decjih godina
	(ako imamo troje dece, broj prosecnih godina za njih troje; ako imamo dvoje racunamo prosecne godine za to dvoje)*/
	
	public static int ukupneGodine;
	public static int brDece;
	public Dete(String ime,String prezime,int brGod) {
		this.ime = ime;
		this.prezime = prezime;
		this.brGod = brGod;
		ukupneGodine = ukupneGodine + brGod;	
		brDece++;
	}
	
	
	
	public String getIme() {
		return ime;
	}



	public String getPrezime() {
		return prezime;
	}



	public int getBrGod() {
		return brGod;
	}



	public static int getBrKlikera() {
		return brKlikera;
	}



	public void dodajKliker() {
		brKlikera++;
		
	}
	
	public void oduzmiKliker() {
		brKlikera --;
	}



	public double prosecneGod() {
	double prosek = Double.valueOf(ukupneGodine) / Double.valueOf(brDece);
	return prosek;
	}



	


	



	
		 
	
}
