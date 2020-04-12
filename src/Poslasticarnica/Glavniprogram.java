package Poslasticarnica;

import java.util.Scanner;

public class Glavniprogram {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);

		Stavka s1 = new Stavka("Limunada",150,true);
		Stavka s2 = new Stavka("Kisela voda", 0, true);
		s2.promeniCenu(100);
		s2.postaviDostupno();
		Stavka s3 = new Stavka("Kafa", 0, false);
		s3.promeniCenu(210);
		s3.postaviNeDostupno();
		
		System.out.println("Unesi br stavki");
		int brStavki = s.nextInt();
		
		Meni m= new Meni(brStavki);
		m.postaviStavku(0, s1);
		String str= m.dohvatiStavku(0).dohvatiNaziv();
		System.out.println(str);
		m.postaviStavku(0, s2);
		System.out.println(m.dohvatiStavku(0).dohvatiNaziv());
		
		
		System.out.println(s1.dohvatiNaziv());
		System.out.println(s1.dohvatiCenu());
		
		
		System.out.println("\n\n");
		System.out.println(m.dohvatiStavku(0));
		
		s.close();

	}

}
