package Zadatak2;



public class Sastojak {
//Sastojak sadr�i naziv i cenu po kilogramu. Svi podaci mogu da se dohvate.
	//Omogu�iti da cena mo�e i da se promeni, ali da nikada ne�e biti negativna.++++++++++++
	//a za svaki sastojak treba znati i koliko grama je potrebno.
	//Treba napraviti metodu koja �e omogu�iti dodavanje sastojka koja izgleda ovako:
	//public void dodajSastojak(Sastojak s, int kolicina);
	//Lista sastojaka mo�e da se dohvati, kao i naziv.
	
	 
	private String naziv;
	private double cenaKg;
	private int g;

	
	public Sastojak(String naziv,double cenaKg,int g) {
		this.naziv = naziv;
		this.cenaKg = cenaKg;	
		this.g = g;

	}

	
	public int getG() {
		return g;
	}
	

	public String getNaziv() {
		return naziv;
	}

	public double getCenaKg() {
		return cenaKg;
	}

	public boolean promeniCenu(double novaCena) {
		if(novaCena <= 0) {
			System.out.println("Greska");
			return false;
		}
	
		else {
			cenaKg = novaCena;
		return true;
		}
	}

	public String toString() {
		return naziv;
	}
	
	 }


	

