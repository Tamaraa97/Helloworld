package itbootcamp.vezbe;

import java.util.Scanner;

public class Sabiranjedvaniza {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi duzinu nizova");
		int n;
		n = sc.nextInt();
		
		int niz1[] = new int[n];
		int niz2[] = new int[n];
		
		System.out.println("Unesite lemente prvog niza");
		for(int i=0;i < n;i++) {
			niz1[i] = sc.nextInt();
		}
		
		System.out.println("Unesi elemente drugog niza");
		//isto je kao i u prvoj petlji definisanje i promenljive
		//definise vrednosti clanova niza
		for(int i = 0;i <= n-1; i++) {
			niz2[i] = sc.nextInt();
		}
		//svj da li u konzoli pisemo clanove niza sa space ili sa enter
		//sluzi za ispis
		//ako se sve stavi u jednu petlju 
		//nizovi imaju isti br clanova
		int[] niz3 = new int[n];
		for(int i=0; i<n; i++) {
			niz3[i] = niz1[i] + niz2[i]; //sabira se clan sa indeksom nula prvog niza+clan sa indeksom nula drugog niza
		}
		
		System.out.println("Zbir clanova dva niza je");
		for(int i=0;i<n;i++) {
			System.out.print(niz3[i] + " ");
		}
	}

}
