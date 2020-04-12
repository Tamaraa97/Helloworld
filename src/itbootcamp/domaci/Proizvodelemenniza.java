package itbootcamp.domaci;

import java.util.Scanner;

public class Proizvodelemenniza {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*napisati program koji ce na standardnom izlazu ispisati proizvod elemenata niza
		 * koji su veci od svog indeksa 
		 * */
	
		
		int n;
		System.out.println("Unesite duzinu niza:");
		n = sc.nextInt();
		
		double []niz = new double[n];
		double proizvod = 1;
		
		System.out.println("Unesi niz");
		for(int i=0; i < n;i++) {
			niz[i] = sc.nextInt();	
			if(niz[i] > i)
				proizvod = proizvod * niz[i];
		}
	
		
		//ispisujemo clanove niza
		for(int i=0; i < n;i++) {
			System.out.println("");
			
			}
		System.out.println("proizvod je"+proizvod);
		
		
		}
}
	


