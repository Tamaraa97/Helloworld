package Picerija;

public class Pica {

	
	/*Za picu se pamte cena i naziv pice kao i broj ukupno prodatih pica.
	 * Napraviti mogucnost da se kreira vise objekata klase Pica,
	 * pri cemu ako se pozove metoda kupi, broj prodatih treba da se azurira.
	 * */ 
	
	/*Napraviti i metodu koja ce da ispisuje broj prodatih,metodu koja ce da menja njenu cenu (postavi na zeljeni iznos)
	i da se zove cena. metodu koja ce da ispisuje cenu koja ce da se zove cena. */ 
	
	
	/*/*Napraviti metodu koja ce da vraca povrsinu pice, i metodu
	koja ce da vraca ukupnu povrsinu svih prodatih.*/
	
	private double cena;
	private String naziv;
	private static int ukupanBrProdatih;
	private int brProdatih;
	private int povrsinaPice;
	private static int ukupnaPovrsina=0;
	
	public Pica(double cena,String naziv,int povrsinaPice) {
		this.cena = cena;
		this.naziv = naziv;
		this.povrsinaPice = povrsinaPice;
		}
	
	
	public int ukupnaPovrsina() {
		ukupnaPovrsina = povrsinaPice;
		return ukupnaPovrsina;
	}
	
	public void ukupnaPovrsina1() {
		ukupnaPovrsina++;
	}
	
	public void KupiPicu() {
		ukupanBrProdatih ++ ;
		brProdatih++;	
	}
	
	public double cena() {
		return cena;
	}
	
	public void cena(double cena) {
		this.cena = cena;
	}
	
	public static int getUkupanBrProdatih() {
		return ukupanBrProdatih;
	}

	public int getBrProdatih() {
		return brProdatih;
	}


	public int getPovrsinaPice() {
		return povrsinaPice;
	}

	public static int getUkupnaPovrsina() {
		return ukupnaPovrsina;
	}
		
	}
	
	

	

	
	

