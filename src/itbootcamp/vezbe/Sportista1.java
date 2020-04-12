package itbootcamp.vezbe;

public class Sportista1 {
	//Sportista poseduje ime, prezime i godinu rodjenja.
	//Ime, prezime i godina rodjenja se zadaju prilikom kreiranja i ne mogu da se promene.
	
	private String ime;
	private String prezime;
	private int godina;
	
	public Sportista1(String im,String pr,int god) {
		ime = im;
		prezime = pr;
		godina = god;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getGodina() {
		return godina;
	}

	@Override
	public String toString() {
		return "Sportista1 [" + ime + " " + prezime + ": " + godina + "]";
	}

	
	

}
