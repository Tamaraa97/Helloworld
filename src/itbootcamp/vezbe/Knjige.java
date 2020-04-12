package itbootcamp.vezbe;

public class Knjige {
	
	private String naziv;
	private Autor autor;
	private int brStrana;
	private int godIzdanja;

	public Knjige(String naziv,Autor autor,int brStrana,int godIzdanja) {
		this.naziv = naziv;
		this.autor = autor;
		this.brStrana = brStrana;
		this.godIzdanja = godIzdanja;
	}

	@Override
	public String toString() {
		return "Knjige [naziv=" + naziv + ", autor=" + autor + ", brStrana=" + brStrana + ", godIzdanja=" + godIzdanja
				+ "]";
	}

	public String getNaziv() {
		return naziv;
	}


	public Autor getAutor() {
		return autor;
	}


	public int getBrStrana() {
		return brStrana;
	}

	public int getGodIzdanja() {
		return godIzdanja;
	}

	public void setGodIzdanja(int godIzdanja) {
		this.godIzdanja = godIzdanja;
	}
	
	
}
