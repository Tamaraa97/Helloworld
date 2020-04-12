package Autobus;

public class Vozac extends Covek1 {
	
	private String zanimanje;
	//Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
	public Vozac(String ime,String prezime,String sofer) {
		super(ime,prezime);
		zanimanje = sofer;
	}
	@Override
	public String toString() {
		return "ime: "+ super.getIme()+",prezime: " + super.getPrezime()+",zanimanje: " + zanimanje;
	}
	
	

}
