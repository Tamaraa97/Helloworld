package Zadatak2;

import java.util.ArrayList;
import java.util.List;



public class Jelo{
//Jelo sadrži svoj naziv i proizvoljno mnogo sastojaka, 
	
	//Pri kreiranju se zadaje samo naziv jela.
	private String nazivJela;
	private List<Sastojak> sastojak;
	private Sastojak sas;
	private int duzinaKuvanja;

	//koliko je grama potrebno
	
	

	public Jelo(String nazivJela) {
		this.nazivJela = nazivJela;	
		this.sastojak = new ArrayList<Sastojak>();
	}

	public String getNazivJela() {
		return nazivJela;
	}
	
	public boolean duzinaKuvanja(Jelo j) {
		if(j.nazivJela == "supa") {
			duzinaKuvanja = 6;
			System.out.println("duzina kuvanja supe je"+duzinaKuvanja+"min");
			return true;
		}
		else {
			System.out.println("Izabrano jelo nije supa");
			return false;
		}
	}
	
	public int getDuzinaKuvanja() {
		return duzinaKuvanja;
	}
	
	//cena s racuna tako sto se cena po kg,a to je npr 950,podeli sa brojem g(1kg=1000g),i dobije se cena po gramu
	//zatim je neophodo dobijeni broj pomnoziti sa brojem grama zadatim u zadatku

	
	
	public boolean proveraSastojka(Jelo j,Sastojak s) {
		if(j.nazivJela=="torta" && s.getNaziv()=="margarin") {
			System.out.println("Jelo sadrzi margarin");
			return true;
			
		}
		System.out.println("Jelo nema margarina");
		return false;
	}
	
	public boolean dodajSastojak(Sastojak s) {
		int br=0;
		if(sastojak.size()==0) {
			sastojak.add(s);
			System.out.println("Dodat je sastojak:"+s.getNaziv());
			return true;
		}
		for(int i=0;i<sastojak.size();i++) {
			if(sastojak.get(i)!=s) {
				br++;
				if(br == sastojak.size()) {
				sastojak.add(s);
				System.out.println("Dodat je sastojak:"+s.getNaziv());
				return true;
			}	
			}
		}
		
		return false;
	}

	public List<Sastojak> getSastojak() {
		return sastojak;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append(nazivJela).append(getSastojak()).toString();
	}

	
	/*public String toString() {
		String jelo = nazivJela+":"+ sas.getNaziv();
		for(int i=0;i<sastojak.size();i++) {
			jelo = jelo+sastojak.get(i).getNaziv();
		}
		return jelo;
	}*/
}

	
	

	
	
	
	
	
	





	



	

	


	
	
	
	
	
	
	
	
	

