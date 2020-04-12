package Flasa;

public class Flasa {

	/*Flaša piæa ima naziv, jednoznaèni automatski generisan indetifikator, cenu bez kaucije, zapreminu. 
	 * Svi podaci se zadaju prilokom stvaranja i mogu da se dohvate, a jedino cena može da se i promeni.
	 *  Na glavnom izlazu se ispisuje u obliku „naziv: indetifikator, cena din, zapremina l“*/
	private String naziv;
	private static int id;

	double cenaBez;
	private double zapremina;
	
	public Flasa(String naziv,int id,double cenaBez,double zapremina) {
		this.naziv = naziv;
		this.cenaBez = cenaBez;
		this.zapremina = zapremina;
		id = id++;
	}

	public String getNaziv() {
		return naziv;
	}
	public static int getId() {
		return id;
	}
	public double getCenaBez() {
		return cenaBez;
	}
	public double getZapremina() {
		return zapremina;
	}
	public void setCenaBez(double cenaBez) {
		this.cenaBez = cenaBez;
	}
	
	public String toString() {
		return naziv+":"+id+cenaBez + "din, " + zapremina + "l, ";
	}
}
