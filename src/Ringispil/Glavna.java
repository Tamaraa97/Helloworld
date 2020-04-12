package Ringispil;

public class Glavna {

	public static void main(String[] args) {
		/*Voznja poseduje naziv(g,s),cenu(g,s),i ljudi koji sede u njoj
		 * Ljudi mogu da se dodaju ili uklone sa voznje
		 * Voznja ima i zadati br sedista,voznja moze da se naplati*/
		
		/*Ringispil je voznja koja poseduje 5 sedista za ljude i trajanje voznje
		 * cena ringispila je 200 din*/ 
		
		/*Covek poseduje naziv i novac(d,o/get),Naziv se postavlja prilikom kreiranja i moze da se dohvati.Novac moze da se doda i oduzme */

	Ringispil r1 = new Ringispil(10);
	r1.dodajCoveka(new Covek("Mirko"));
	
	// Covek c = new Covek("Mirko") ova dva su jedno te isto
	r1.dodajCoveka(new Covek("Pera"));
	Covek maja = new Covek("Maja");
	r1.dodajCoveka(maja);
	r1.naplata();
	
	System.out.println(maja.getNovac());
	System.out.println(r1);
	//Voznja v1 = new Voznja("ringispil",200,5);
	}
		
}
