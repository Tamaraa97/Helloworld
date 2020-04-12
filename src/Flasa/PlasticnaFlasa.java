package Flasa;

public class PlasticnaFlasa extends Flasa{
/* Plastica flasa je flasa gde je cena sa kaucijom = ceni bez kaucije.izlaz flasa-plasticna
 * */ 
	private double cenaSa;

public PlasticnaFlasa(String naziv,int id,double cenaBez,double zapremina,double cenaSa) {
	super(naziv,id,cenaBez,zapremina);
	cenaSa = cenaBez;
}

public double cenaSaKaucijom() {
	return cenaSa;
}

public String toString() {
	return super.toString()+"- plasticna";
}
	
	
	
}
