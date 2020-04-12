package Autobus;

public class Putnik extends Covek1 {
	/*Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja.
	 * Odredjena svota novca moze da mu se doda i/ili oduzme, 
	 * gde je potrebno vratiti indikator uspesnosti*/
	
	
	private double novac;
	public Putnik(String ime,String prezime,double novac) {
		super(ime,prezime);
		this.novac = novac;
	}
	public double getNovac() {
		System.out.println("Stanje na racunu:");
		return novac;
	}
	
	public boolean dodajNovac(double iznos) {
		if(iznos>0) {
			novac = novac+iznos;
			return true;
	}else {
		System.out.println("Greska");
		return false;
	}
	}
	
	public double podigniNovac(double iznos) {
		if(iznos>0 && iznos <= novac) {
			novac = novac - iznos;
		}
			else {
				System.out.println("Greska");
				
			}
			return novac;
	}
	}
	
	