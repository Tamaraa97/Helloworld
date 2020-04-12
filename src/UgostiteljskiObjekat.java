import java.util.Scanner;

public class UgostiteljskiObjekat {
	
	public static void naplati(double racun, double novac) {
		double kusur;
		if(racun>=novac) 
			System.out.println("Greska");
		else {
			kusur = novac - racun;
			System.out.println("Kusur je"+kusur);
		}
	}
	public static void main(String[] args) {
	/*
		/*
		Zadatak 1 
		Napisati program na programskom jeziku Java koji ima sledece funkcionalnosti za potrebe 
		ugostiteljskog objekta:
		Program sadrzi meni koji ima sledece opcije:
		0 - Izlaz
		1 - Dodavanje cene na racun
		2 - Naplata racuna
		Ukoliko korisnik unese opciju 0 program se zavrsava.
		Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena 
		se dodaje na racun korisnika.
		Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu 
		racuna i poziva metodu naplati(double iznosRacuna, double novac).
		Metoda naplati  ako korisnik unese vrednost manju od vrednosti racuna ispisuje gresku, a 
		ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje kusur.
		Nakon obrade racun se stornira to jest postavlja na nulu. Zatim se ponovo ispisuje meni.*/
		Scanner sc = new Scanner(System.in);
		int opcija = 0;
		double cena;
		double racun=0;
		double novac;
		do {
			System.out.println("Unesite opciju:");
			System.out.println("0-izlaz,1-dodavanje cene na racun,2-naplata racuna");
				opcija = sc.nextInt();
				
				if(opcija == 0) {
					System.out.println("Kraj programa");
					break;
				}
			switch(opcija) {
		case 1:{
			System.out.println("Unesi cenu proizvoda");
			cena = sc.nextDouble();
			if(cena<0) {
				System.out.println("Uneli ste pogresnu cenu");
			}
			else {
				racun = racun+cena;
				System.out.println("Iznos racuna je"+racun);
			}
			continue;
		}
		
		case 2:{
			if(racun == 0) {
				System.out.println("Nema nista za naplatu");
			}
			else {
				System.out.println("Unesi kolicinu novac za naplatu");
				novac = sc.nextDouble();
				naplati(racun,novac);
				racun = 0;	
			}
			continue;
		}
		
		default:
			System.out.println("Uneli ste opciju koja ne postoji");
			break;
			}
			}while(opcija>=0);
	}
}
			
		
		
		
		

	


