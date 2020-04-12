package Flasa;

public class StaklenaFlasa extends Flasa{	
	/* Staklena flaša piæa je flaša piæa kod koje se cena sa kaucijom raèuna tako što se na cenu bez kaucije doda 5% od cene ukoliko je zapremina manja od 0,5l, 
	 * ili se doda 10% od cene ukoliko je zapremina vaæa ili jednaka od 0,5l. 
	 * Na glavnom ekranu se ispisuje flaša – staklena. */
	
	private double cenaSa;
	
	public StaklenaFlasa(String naziv,int id,double cenaBez,double zapremina,double cenaSa) {
		super(naziv,id,cenaBez,zapremina);
		if(cenaBez <= 0) 
			System.out.println("Greska");
		else {
			this.cenaBez = cenaBez;
		if(zapremina<=0)
			System.out.println("Greska");
		else {
		if(zapremina < 0.5) 
			cenaSa = cenaBez * 1.05;
		else 
			cenaSa = cenaBez * 1.10;
		
	}
		}
	}
		
	
	
	public StaklenaFlasa(String naziv,int id,double cenaBez,double zapremina) {
		super(naziv,id,cenaBez,zapremina);
		if(cenaBez <= 0)
			System.out.println("Greska");
		this.cenaSa = cenaSa * 1.05;
		
	}
	
	public double cenaSaKaucijom() {
		return cenaSa;
	}

	
	public double getCenaSa() {
		return cenaSa;
	}


	public void setCenaSa(double cenaSa) {
		this.cenaSa = cenaSa;
	}


	public double cenaSa() {
		return cenaSa;
	}
	
	
	

	
	public String toString() {
		return super.toString() + "- staklena";
	}
}
