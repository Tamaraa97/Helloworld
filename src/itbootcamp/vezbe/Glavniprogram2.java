package itbootcamp.vezbe;

public class Glavniprogram2 {

	public static void main(String[] args) {
		
		
		Sportista1 sp1 = new Sportista1("Milan","Borjan",1987);
		System.out.println(sp1);
		Sportista1 sp2 = new Sportista1("Nemanja","Milunovic",1989);
		System.out.println(sp2);
		Sportista1 sp3 = new Sportista1("Vladimir","Stojkovic",1983);
		System.out.println(sp3);
	
		
		Klub k1 = new Klub("Crvena zvezda","Beograd",1945,sp1);
		System.out.println(k1);
		
		Klub k2 = new Klub("Partizan","Beograd",1945,sp3);
		System.out.println(k2);

		k2.getNaziv();
		System.out.println(k2.getNaziv());
		
		sp2.getGodina();
		System.out.println(sp2.getGodina());
		
		

	}

}
