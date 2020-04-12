package itbootcamp.domaci;

import java.util.Scanner;

public class kasa {

	public static void main(String[] args) {
	/*Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:
	 * 0 - Izlaz iz programa,Ukoliko korisnik unese opciju 0 program se zavrsava.
	 * 1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu),
	 * 	   Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici
	 * 2 - naplata racuna,Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
	 * 	 - Ukoliko korisnik unese vrednost manju od vrednosti racuna,
	 *     potrebno je da se ispise greska, bez umanjenja racuna i da se ponovo ispise meni
	 *   -Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur 
	 *   i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.
	 */
		Scanner sc = new Scanner(System.in);
		double racun = 0;
		double cena;
		double naplata;
		double x;
		double kusur;
		do {
			System.out.println("Unesite opciju");
			x = sc.nextDouble();
			if(x == 1) {
				System.out.println("Unesi cenu proizvoda");
				cena = sc.nextDouble();
				if(cena>0) {
				racun = racun+cena;
				System.out.println("Iznos racuna je"+racun);
				}
				else {
					System.out.println("Cena proizvoda mora da bude veca od nule");
				}
			}
			
			else if(x == 2){
				System.out.println("Unesite kolicinu novca za naplatu:");
				naplata = sc.nextDouble();
				if(naplata<racun) {
					System.out.println("Greska!");
					System.out.println("Stanje racuna"+racun);
				}
				else {
					kusur = naplata - racun;
					System.out.println("Kusur je"+kusur);
					racun = 0;
					System.out.println("Racun je"+" "+racun);
					
				}	
			}
			
			else if(x == 0){
			 System.out.println("Kraj programa");
			 break;
			}
			
			else {
				System.out.println("Izabrana je opcija koja ne postoji");
			}
		}while(x>=0);
		System.out.println(" ");

}
}