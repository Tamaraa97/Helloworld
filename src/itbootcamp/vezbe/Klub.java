package itbootcamp.vezbe;

public class Klub {
/* Klub poseduje naziv, sediste (grad), godinu osnivanja i niz sportista tipa Sportista
 * Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
 * Napisati metodu koja ce ispisati ceo objekat klase klub
 */
	
	private String naziv;
	private String grad;
	private int godOsnivanja;
	private Sportista1 sportista;
	
	public Klub(String naziv,String grad,int godOsnivanja,Sportista1 sportista) {
		this.naziv = naziv;
		this.grad = grad;
		this.godOsnivanja = godOsnivanja;
		this.sportista = sportista;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getGrad() {
		return grad;
	}

	public int getGodOsnivanja() {
		return godOsnivanja;
	}

	public Sportista1 getSportista() {
		return sportista;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String toString() {
		return "Klub [naziv=" + naziv + ", grad=" + grad + ", godOsnivanja=" + godOsnivanja + ", sportista=" + sportista
				+ "]";
	}

	
	
	
	
	
}
