package Pozoriste;

public class Pozoriste {
/*Pozoriste ima jednoznacan automatski generisan celobrojan identifikator 
	i naziv koji mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku naziv[id].*/
	
	private int id;
	private static int globalId;
	private String naziv;
	
	
	public Pozoriste(int id,String naziv) {
		this.id = globalId;
		this.naziv = naziv;
	}


	public int getId() {
		return id;
	}


	public String getNaziv() {
		return naziv;
	}
	
	public String toString() {
		return naziv+"["+id+"]";
	}
	
}
