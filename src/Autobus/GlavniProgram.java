package Autobus;

public class GlavniProgram {

	public static void main(String[] args) {
		
	/*	Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta. 
		Svi podaci mogu da se dohvate, ali ne i postave.
		Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
		Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
		Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
		Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze. 
		Naziv i cena kartei zadaju se prilikom kreiranja. 
		Moguce je dodati/ukloniti putnika kao i vozaca.
		 Moguce je naplatitikartu putnicima samo ako je vozac prisutan
		. Autobus ispisati u sledecem obliku:Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... )*/
		
		Covek1 c1 = new Covek1("Ana","Jovic");
		Covek1 c2 = new Covek1("Jelena","Jovanovic");
		
		Vozac v1 = new Vozac("Nikola","Petkovic","sofer");
		Vozac v2 = new Vozac("Pera","Peric",null);
		
		Putnik p1 = new Putnik("Sara","Milunovic",10000);
		Putnik p2 = new Putnik("Tara","Milunovic",20000);
		
		Autobus1 a1 = new Autobus1("Lasta",220,30);
		Autobus1 a2 = new Autobus1("Fudeks",225,30);
		
		System.out.println("Autobus br 1");
		a1.dodajVozaca(v1);
		System.out.println(a1.getVozac());
		System.out.println(a1.dodajVozaca(v1));
		System.out.println(a1.getVozac());
		System.out.println(a1.ukloniVozaca(v1));
		System.out.println(a1.getVozac());
		System.out.println(a1.dodajVozaca(v2));
		System.out.println(a1.getVozac());
		
		System.out.println(a1.dodajPutnika(p1));
		System.out.println(a1.dodajPutnika(p2));
		System.out.println(a1.ukloniPutnika(p1));
		System.out.println(a2.dodajPutnika(p2));
		
		a1.naplatiKartu(p1);
		a2.naplatiKartu(p1);
		
		
		

	}

}
