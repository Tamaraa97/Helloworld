package Autobus;

import java.util.Arrays;

public class Autobus1 {
/*Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze. 
 * Naziv i cena kartei zadaju se prilikom kreiranja.
 * Moguce je dodati/ukloniti putnika kao i vozaca.
 *   Moguce je naplatiti kartu putnicima samo ako je vozac prisutan
 */
	
	
	private String nazivAutobusa;
	private Vozac vozac;
	private double cenaKarte;
	private Putnik[] putnici;
	
	
	public Autobus1(String nazivAutobusa,double cenaKarte,int brMesta) {
		this.nazivAutobusa = nazivAutobusa;
		this.cenaKarte = cenaKarte;
		putnici = new Putnik[brMesta];
	}

	public Vozac getVozac() {
		return vozac;
	}

	public String getNazivAutobusa() {
		return nazivAutobusa;
	}

	public double getCenaKarte() {
		return cenaKarte;
	}

	public Putnik[] getPutnici() {
		return putnici;
	}
	
	public boolean dodajVozaca(Vozac v) {
		if(vozac == null) {
			vozac = v;
			return true;
		}
		else {
			System.out.println("Vozac vec postoji");
			return false;
		}	
	}
	
	public boolean ukloniVozaca(Vozac v) {
		if(vozac == v) {
			vozac = null;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean dodajPutnika(Putnik p1) {
		for(int i=0;i<putnici.length;i++) {
			if(putnici[i]==null) {
				putnici[i]=p1;
				return true;
			}	
		}
		return false;
	}
	
	public boolean ukloniPutnika(Putnik p1) {
		for(int i=0;i<putnici.length;i++) {
			if(putnici[i]==p1) {
				putnici[i] = null;
				return true;
			}
		}
		return false;
	}
	
	
	public void naplatiKartu(Putnik p1) {
		if(vozac != null && putnici != null ) {
			System.out.println(p1.podigniNovac(cenaKarte));	
		}
		else {
			System.out.println("Vozac nije prisutan");
		}
	}
	


	@Override
	public String toString() {
		return "Autobus1 [nazivAutobusa=" + nazivAutobusa + ", vozac=" + vozac + ", cenaKarte=" + cenaKarte
				+ ", putnici=" + Arrays.toString(putnici) + "]";
	}
	
	/*Autobus ispisati u sledecem obliku:Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... */
	
	
		
	
	
	
	}
	

