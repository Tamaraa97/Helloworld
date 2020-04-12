package itbootcamp.vezbe;

import java.util.Arrays;
import java.util.Scanner;

public class racunanjereztestova {
	// pisu se i [] jer je rec i nizu,i vraca niz naredbi
	//hocemo da nam metoda ucita jedan niz
	public static int[] ucitajNiz(int brElem) {
		//definisemo niz i koliko hocemo da imamo elemenata niz
		int niz[] = new int[brElem];
		
		Scanner sc = new Scanner(System.in);
		//nmze da bude <= kod duzine niza,mora manje
		//kroz ovu petlju smo svakom clanu niza dodelili vrednost
		for(int i=0; i < niz.length;i++) {
			niz[i] = sc.nextInt();
	}
		return niz;
	}
	

	// ovde nema potrebe da se pise return jer je vec navedeno da treba da ispise
	public static void ispisiNiz(double[] niz) {
		for(int i=0;i < niz.length; i++) {
			System.out.println(niz[i]+" ");
		}
	}
	// kada radimo u return mozemo da definisemo nove vrednosti
	//metoda racuna srednju vrednost rezultat sa testa 1 i testa2
	//svaki clan niza je pojedinacna osoba,a njih zovemo po pozicijama npr osoba 0
	//koristimo jer je bolji double zbog deljenja,i rezultat je double i ako su uneti intedzeri
	public static double[] uporedi(int niz1[],int niz2[]) {
		
		// hpcemo da nas niz ima isto onoliko elemenata koliko ima i niz1
		double poredjenje[] = new double[niz1.length];
		
		for(int i=0;i < poredjenje.length;i++) {
			poredjenje[i] = (niz1[i]+niz2[i]) / 2.0;
		}
		
		return poredjenje;
	}
	
	public static double nadjimax(double[] n) {
		//kad je usao u ovu metodu,n se sad zove rezultat,max =n[0];
		// u 1.literaciji,1,u 2.iteraciji i=2,u 3. i=3,u 4 iter. i kao return se vraca stvarno najveca vrednost od svih u nizu
		double max = n[0];
		for(int i = 1; i < n.length;i++) {
			if(n[i] > max)
				max = n[i];
		}
		return max;
	}
	
	public static void ispisinaj(double[] niz) {
		//ovde ulazi u telo nadji max,ovo je isto kao da je napisano nadjimax(rez);
		double max = nadjimax(niz);
		System.out.println("Osobe koje iimaju" + max + "poena su");
		//ispisuje vrednost koja je kao return vracena u nadjimax
		for(int i=0;i < niz.length;i++) {
			// trazi koliko clanova niza ima ovu vrednost
			if(niz[i] == max) {
				//ispisuje poziciju elementa gde je maximum smesten
				
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Ispisi clanove prvog niza");
		
		//u konzoli ce pisati i iza zadovoljnog uslova i dalje vrednosti,ali ih na kraju ignorise smao kada se koristi space
		//rezultat ove komande je niz
		//samo smo nizu dodelili naziv,onaj prethodno definisan niz "niz" smo samo preimenovali u test1
		int test1[] = ucitajNiz(5);
		/*System.out.println(Arrays.toString(test1)); ispisuje niz*/
		
		//dodeljujemo nove vrednosti niza,i kad ih napisemo,dodelimo im ime test2
		System.out.println("Ispisi clanove drugog niza");
		int test2[] = ucitajNiz(5);
		//step return vraca na prethodne linije koda,bitna su nam variables i breakpoints
		//dodelili smo nizu ime rez
		//vec smo ih definisali kao nizove test 1 i test 2 zato sad nisu potrebne [] kod njih
		uporedi(test1,test2);
		double rez[] = uporedi(test1, test2);
		System.out.println("Poredjenje rezultata za 5 polaznika je");
		//step over neke korake preskace,ali ne ide detaljno kao step info
		//debager-omogucava da pratimo liniju po liniju koda po njenom redosledu izvrsavanja,toogle breakpoint,klikne se na broj linije
		//onda se vrednosti rucno unose
		ispisinaj(rez);
		ispisiNiz(rez);
		
		
		}

	}


