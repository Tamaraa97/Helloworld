package Zadatak2;

public class GlavniProgram {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
		/*Sastojci za tortu:
		pudinga od vanile,1 margarin,180 g secera,100g kokosa,250g keksa,180g slaga*/ 
		
		//cena po kg 750,40 gr nam je potrebno,za 40g kosta 30 din
		Sastojak s1 = new Sastojak("puding od vanile",750,40);
		//cena 240 din/kg,250g nam je potrebno,za 250g kosta 60 din
		Sastojak s2 = new Sastojak("margarin",240,250);
		//cena je 73din/kg,180g secera,za 180g to je 13 din
		Sastojak s3 = new Sastojak("Secer",73,180);
		//cena je 950 din/kg,nama je porebno 100g,a za 100g kosta 95 din
		Sastojak s4 = new Sastojak("kokos",950,100);
		// cena je272 din/kg,potrebno nam je 250g,za 250g kosta 68din
		Sastojak s5 = new Sastojak("keks",272,250);
		//cena je583 din/kg ,potrebno nam je 180g,za 180g kosta 105 din
		Sastojak s6 = new Sastojak("slag",583,180);
		/*sastojci za supu
		 * 500gr sargarepe,1 persun zacin,500g pileceg mesa,rezanci,celer*/
		
		//44 din/kg,nama je potrebno 500g,a to je 22 din
		Sastojak s7 = new Sastojak("sargarepa",44,500);
		//7142din/kg,nama je potrebno 7g,a to je 50din
		Sastojak s8 = new Sastojak("persun",7142,7);
		//740din/kg nama je potrebno 500G,a to je 370din
		Sastojak s9 = new Sastojak("pilece meso",740,500);
		//720din/kg kostaju,nama je potrbno 250g,a to je 180din
		Sastojak s10 = new Sastojak("rezanci",720,250);
		
		
		/*Sastojci za salatu od susama
		 * 100g susama,200g sunke,200g kackavalja*/
		//susam-700din/kg kosta,nama je potrebno 100g a to je 70 din;
		Sastojak s11 = new Sastojak("susam",700,100);
		//sunka,519din/kg,nama je potrebno 200g a to je 104 din
		Sastojak s12 = new Sastojak("sunka",519,200);
		//kackavalj-820din/kg,nama je potrebno 200g a to je 164 din
		Sastojak s13 = new Sastojak("kackavalj",820,200);
	
	
		Jelo j1 = new Jelo("torta");
		Jelo j2 = new Jelo("supa");
		Jelo j3 = new Jelo("salata od susama");
		
		j1.dodajSastojak(s6);
		j1.dodajSastojak(s4);
		j1.dodajSastojak(s5);
		j1.dodajSastojak(s2);
		j1.dodajSastojak(s1);
		System.out.println("Sastojci su" +j1.getSastojak());
	
		j1.proveraSastojka(j1, s6);
		j1.proveraSastojka(j1, s2);
		j2.proveraSastojka(j2, s5);
		j2.proveraSastojka(j2, s2);
	
		
		//jelo moze da se dohvati na osnovu naziva
		System.out.println(j1.getNazivJela());
		
		j1.duzinaKuvanja(j1);
		j2.duzinaKuvanja(j2);
		j1.getDuzinaKuvanja();
		System.out.println(s7.getNaziv());
		
		//proverava koliko grama nam je potrebno
		System.out.println(s3.getG());
		
		j2.dodajSastojak(s7);
		j2.dodajSastojak(s8);
		j2.dodajSastojak(s9);
		j2.dodajSastojak(s10);
		System.out.println("Sastojci su" + j2.getSastojak());
		
		
		j3.dodajSastojak(s11);
		j3.dodajSastojak(s12);
		j3.dodajSastojak(s13);
		System.out.println("Sastojci su"+j3.getSastojak());
		
		Meni meni = new Meni(j1, s1);
		meni.dodajJelo(j1);
		meni.dodajJelo(j2);
		meni.dodajJelo(j3);
		System.out.println(meni);

	   

	
	

	}

}
