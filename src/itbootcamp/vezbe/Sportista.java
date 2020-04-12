package itbootcamp.vezbe;

public class Sportista {

	
	private String imeIPrezime;
	private String sport;
	private String klub;
	private int broj;
	//u startu imaju vrednost null,da bi izbegli da idalje imaju vrednost null,
	//mi dodeljujemo pocetnu vrednost tipa sportista s1 = ...tako dodeljujemo nove vrednosti
	//pvaj deo koda se naziva KONSTRUKTOR
	public Sportista(String ip,String s,String k,int b) {
		//AKO HOCEMO ISTO IME I U KONSTRUKTORU I OVDE ONDA ISPRED PROMENLJIVE MORA THIS
		imeIPrezime = ip;
		sport = s;
		klub = k;
		broj = b;
	}
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	
	public String getSport() {
		return sport;
	}
	
	
	public String getKlub() {
		return klub;
	}
	
	public void setKlub(String k) {
		klub = k;
	}
	
	public int getBroj() {
		return broj;
	}
	
	public void setBroj(int b) {
		broj = b;
		
	}
}
