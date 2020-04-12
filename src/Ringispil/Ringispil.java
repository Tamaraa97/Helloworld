package Ringispil;

public class Ringispil extends Voznja{
	/*Ringispil je voznja koja poseduje 5 sedista za ljude i trajanje voznje
	 * cena ringispila je 200 din*/ 
	
	private int trajVoznje;
	
	public Ringispil(int trajVoznje) {
		//da ne bi sve pisaali u konstruktoru neke vrednosti smo iz klase Voznja odmah upisali
		super("Ringispil",200,5);
		this.trajVoznje = trajVoznje;
	}
	
	
}
