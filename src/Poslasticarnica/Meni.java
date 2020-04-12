package Poslasticarnica;

public class Meni {

	/*U poslasticarnici postoji meni u kome svaka stavka treba da ima naziv i cenu koju je moguce
menjati, kao i informaciju o tome da li je trenutno dostupna u poslasticarnici.
Musterijama se mora izdavati racun koji sadrzi sve stavke sa menija koji ona kupuje, kao i
ukupan iznos koji treba platiti.
Takodje se treba voditi racuna o tome da li je racun placen ili nije.*/
	private Stavka[] meni;

	
	public Meni(int brStavki) {
		meni = new Stavka[brStavki];
	}
	
	public Stavka dohvatiStavku(int pozicija) {
		if(pozicija < 0 && pozicija > meni.length) {
			System.out.println("Izabrana je pozicija koja ne postoji");
			return null;
		}
		return meni[pozicija];
		}
	public Stavka postaviStavku(int pozicija,Stavka s) {
		if (pozicija<0 || pozicija> meni.length) {
			System.out.println("Neadekvatna pozicija!");
			return null;
		}
		if(meni[pozicija] != null) {
			System.out.println("Stavka vec postoji na toj poziciji");
		}
		else {
			meni[pozicija] = s;
		}
		return s;
		
	}
	
}
