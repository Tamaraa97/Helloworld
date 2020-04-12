package itbootcamp.vezbe;

import java.util.Scanner;

public class Sabiranjedvanizasarazvredn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	//treba da se koriste if,
	//kad se dodje do nekog clana niza koji se ne poklapa ,i dalje ce raditi kao zbir,ali ce sabirati sa nulom

		int n;
		int n1= sc.nextInt() ;
		int n2= sc.nextInt();
		int niz1[] = new int[n1];
		int niz2[] = new int[n2];
		
		System.out.println("Ispisi elemente prvog niza");
		for(int i=0;i < n1;i++) {
		niz1[i] = sc.nextInt();
		}
		System.out.println(" ");
		System.out.println("Ispisi elemente drugog niza");
		for(int i = 0;i <= n2; i++) {
		niz2[i] = sc.nextInt();
		}
		
		int []niz3;
		if(n1 > n2) {
			niz3 = new int[n1];
		}
		else {
			niz3 = new int[n2];
		}
		
		//sabiramo elemente kojii postoje u oba niza
		for(int i=0; i<n1 && i < n2; i++) {
			niz3[i] = niz1[i] + niz2[i];
		}
		
		if(n1 > n2) {
			for(int i = n2; i<n1; i++)
				niz3[i]= niz1[i];	
		}
		else {
			for(int i = n1;i < n2;i++)
				niz3[i]= niz2[i];
		}
		
		System.out.println("Zbir clanova dva niza je");
		for(int i=0;i<niz3.length;i++) {
			System.out.print(niz3[i] + " ");
		}
		
		
		
	}

}
