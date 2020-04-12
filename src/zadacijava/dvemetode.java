package zadacijava;

import java.util.Scanner;

public class dvemetode {
	/*Napisati program koji ucitava niz od n celih brojeva i dve metode. 
	 * Prva metoda vraca proizvod elemenata na neparnim pozicijama,
	 * a druga vraca zbir parnih elemenata niza
	 *  */
	
	public static double[] ucitajniz(int duzina) {
		double [] niz = new double[duzina];
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi clanove niza");
		for(int i=0;i < duzina;i++) {
			niz[i] = sc.nextDouble();
		}
		return niz;

	}
	
	public static void ispisniza(double niz[]) {
		System.out.println("Ispisi niz");
		for(int i=0;i < niz.length;i++) {
			System.out.println(niz[i]);
		}
	}
	
	public static void proizvodNeparnih(double[] niz) {
		double proizvod = 1;
		System.out.println("Proizvod je");
		for(int i=0; i<niz.length; i++) {
			if(i%2 != 0) {
				proizvod = proizvod * niz[i];
			}
		}
		System.out.println(proizvod);
		}	
	
	public static void zbirParnih(double[] niz) {
		double zbir=0;
		System.out.println("Zbir clanova je");
		for(int i=0;i < niz.length;i++) {
			if(i%2 == 0) {
				zbir = zbir+niz[i];
			}
		}
		System.out.println(zbir);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int duzina=0;
		System.out.println("Unesi duzinu niza");
		duzina = sc.nextInt();
		if(duzina >0) {
		double [] niz = ucitajniz(duzina);
		
		
		ispisniza(niz);
		proizvodNeparnih(niz);
		zbirParnih(niz);
		}
		else {
			System.out.println("Uneli ste negativnu vrednost");
		}

	}


		
	}

