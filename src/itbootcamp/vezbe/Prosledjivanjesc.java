package itbootcamp.vezbe;

import java.util.Scanner;

public class Prosledjivanjesc {
	//metoda se pise pre glavne metode,a poziva se u glavnoj
	//kada je metoda static,a mi koristimo tu promenljivu u metodi onda mora i promenljiva da ima naziv static
	static int broj1;
	static int broj2;
	//definisemo skener unutra metode jer zelimo sami da ispisujemo 
	//ako ovako def skener,onda citam kod za skener moramo da ispisemo u glavnoj metodi
	//program radi linearno ide prvo u metodu,pa onda izavrsava poziv metode,i tako dok ne izvrsi sve metode
	public static int saberi(Scanner sc) {
		broj1 = sc.nextInt();
		broj2 = sc.nextInt();
		return broj1+broj2;
	}
	//ako metodu definisemo kroz skener,onda nece moci ovde u zagradi da stoje parametri
	public static int saberi2() {
		Scanner sc = new Scanner(System.in);
		broj1 = sc.nextInt();
		broj2 = sc.nextInt();
		return broj1 + broj2;
	}
	
	public static int saberi3(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//posto su akcije u pitanju,ovaj kod bi ponavljao akcije dva puta
		//saberi(sc);
		//pozivanje metode
		//System.out.println(saberi(sc));
		
		System.out.println(saberi2());
		//mozemo naziv int a da promenimo u broj 1,jer se sve desava linearno,a i gore su vec definisane vrednosti broj1 i broj2 on ce samo da ih iskoristi
		//bitno je da su samo istog tipa
		saberi3(broj1,broj2);
		// u konzoli je ispisao 30,30 jer postoje dve metode
		
		System.out.println(saberi3(broj1,broj2));

	}

}
