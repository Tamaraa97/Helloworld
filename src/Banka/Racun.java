package Banka;

public class Racun {
	//ovu su polja
	private String brRacuna;
	private double stanje;
	
	//broj racuna moze da se dohvati a ne i postavi
	public String dohvatiBrRacuna() {
		return brRacuna;
	}
	public double dohvatiStanje() {
		return stanje;
	}
	//stanje ima pocetnu vrednost nula,napisati metod za dodavanje i uzimanje novca
	public boolean uplati(double iznos) {
		if(iznos>0) {
			stanje = stanje + iznos;
			return true;
		}
		System.out.println("Doslo je do greske....");
		return false;
	}
	
	public double podigni(double iznos) {
		if(iznos > 0 && iznos <=stanje) {
			stanje = stanje - iznos;
		}
		else {
		System.out.println("Greska");
	}
		return stanje;	
	}

}
