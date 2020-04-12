import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestPitanja {
	// upisivanje elemenata u niz
	public static String[] unos(int brPit, String ime) {
		String[] odgovori = new String[brPit];
		Scanner sc = new Scanner(System.in);
		System.out.println("Unos odgovora unosite u formatu : 0-netacno 1-tacno");
		for (int i = 0; i < brPit; i++) { 
			System.out.println("Unesi " + (i + 1) + ". odgovor");
			odgovori[i] = sc.next();
			if (odgovori[i].equals("0") && odgovori[i].equals("1")) System.out.println("Greska u unosu");
		}
		return odgovori;
	}
	
	
	// Ispisivanje unetog niza
	public static void ispisiOdg(String[] odgovori, String ime) {
		System.out.println(""); // pravimo nov red da odvojimo ispis od unosa
		System.out.print("Odgovori studenta " + ime + ": ");
		for (int i = 0; i < odgovori.length; i++) {
			if (odgovori[i].equals("1") ) System.out.print("tacno ");
			if (odgovori[i].equals("0") ) System.out.print("netacno ");
		}
		System.out.println("");
	}
	
	
	// Da li je polozio
	public static String polozio(String [] odgovori) {
		String S = "";
		int brojac=0;
		int zaCelobrojnoDeljenje=0;		// deklarisemo novu promenljivu
		for (int i = 0; i < odgovori.length; i++) {
			if (odgovori[i].equals("1")) brojac = brojac+1;
		}
		if (odgovori.length %2 == 1) zaCelobrojnoDeljenje = odgovori.length +1;
		else zaCelobrojnoDeljenje = odgovori.length;
		if (brojac>= zaCelobrojnoDeljenje/2) S = "Polozio sa " + brojac + "/" + odgovori.length + " tacna odgovora";
		else S = "Pao, fali mu " + (zaCelobrojnoDeljenje/2 - brojac) + " tacna odgovora";
		return S;
	}
	public static void main(String[] args) {
		
		// POSTAVKA ZADATKA:
		
		// Napisati program koji od korisnika trazi da unese koliko na testu ima pitanja. 
		// Zatim, koristeci metodu, ucitava ime i prezime studenta, kao i da li je za svako 
		// pitanje odgovor koji je student dao tacan ili netacan.
		// Napraviti ( i na odgovarajucem mestu pozvati)  metodu kojoj je povratna vrednost 
		// String i ispisati poruku koja daje informaciju o tome da li je student pao ili polozio ispit, 
		// kao i koliko ima tacnih odgovora.
		// (Polozio je ako ima vise od 50%)
		// Ukoliko student nije polozio, napisati koliko poena mu fali da bi ocena bila prelazna. Moguce je iskoristiti metodu iz prethodne tacke i dopuniti je.

		// Bonus zahtev:
		// Omoguciti korisniku (profesoru) da unosi informacije o studentima sve dok ne unese rec ‘stop’. (Broj pitanja na testu unosi samo jednom, na pocetku izvrsavanja programa)

		// Napomena: Poredjenje dva String-a na jednakost ne vrsi se pomocu == vec string1.equals(string2)

		
		
		// Unos koliko pitanja ima na testu
		Scanner sc = new Scanner(System.in);
		//PrintWriter out = new PrintWriter(System.out);		// pokusao da sacuvam sta se ispisuje u konzoli, ne radi 
		
		int brPit;
		do {
			System.out.print("Unesite broj pitanja na testu: ");
			while (!sc.hasNextInt()) { System.out.print("To nije ocekivani rezultat, pokusajte ponovo: ");
				sc.next();
			}
			brPit = sc.nextInt();
			if (brPit == 0)System.out.print("Broj pitanja ne moze biti 0. ");
			if (brPit < 0) System.out.print("Broj pitanja ne moze biti negativan. ");
			if (brPit == 1) System.out.println("Nema smisla dati jedno pitanje na testu, ali OK, kako hoces");
		} while (brPit < 0);
		
		String[] odgovori;
		String ime;
		do {
			System.out.print("Unesite Ime studenta ili stop za prekid rada: ");
			while (sc.hasNextInt() ) { 			// ukoliko greskom dva puta ukuca broj
				System.out.print("Ime ne moze biti broj, pokusajte ponovo: ");
				sc.next();
			}
			ime = sc.next();
			if ("stop".contentEquals(ime.toLowerCase()) == true) break;
			odgovori = unos(brPit, ime);
			ispisiOdg(odgovori, ime);
			String prosao = polozio(odgovori);
			System.out.println(prosao);
			
			// Ispis u .txt fajl
			try {
		        BufferedWriter out = new BufferedWriter(new FileWriter("file.txt", true));
		        out.write(ime + " ");
		        
		            for (int i = 0; i < brPit; i++) {
		            	if (odgovori[i].equals("1") ) out.write(" +");
						if (odgovori[i].equals("0") ) out.write(" -");  
		            }
		            out.write("   " + prosao);
		            out.write("\n");
		            out.close();
		        } catch (IOException e) {}
			
			System.out.println("");
		} while (ime.equals("stop") == false);		// u sustini nebitno, jer ima break;
	}

	}


