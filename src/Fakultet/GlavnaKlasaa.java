package Fakultet;

public class GlavnaKlasaa {

	public static void main(String[] args) {
		Osobe o1 = new Osobe("Tamara","Jovanovic","Nikolaja Gogolja","3747383383","2626373737");
		Studenti s1 = new Studenti("Jelena","Jovanovic","Adresa1","1053383383","1849273737",0001,4);
		Studenti s2 = new Studenti("Tamara","Pecnik","Adresa2","5653382283","0009273737",0002,4);
		Profesori p1 = new Profesori("Dragoljub","Bora",null,"5611111183","1112273737","Manuelno testiranje");
		System.out.println(s1.getIme());
		System.out.println(p1.getBrLk());
		System.out.println(p1.getAdresa());

	}

}
