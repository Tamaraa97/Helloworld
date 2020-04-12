package itbootcamp.vezbe;

import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		/*Traziti od korisnika da unese pozitivan broj N. 
		 * Zatim ucitavati N brojeva sa standardnog ulaza i ispisati vrednost najmanjeg unetog broja.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj n:");
		int n=sc.nextInt();
		while(n<=1) {
			System.out.println("Greska!Unesi n ponovo");
			n=sc.nextInt();
		}
		
			System.out.println("Unesi broj:");
			int br = sc.nextInt();
			int min = br;
			System.out.println("minimum je"+min);
		
			int i = 1;
			while(i<n) {	
			br = sc.nextInt();
			if(br<min) 	
				min = br;	
			System.out.println("Minimum je"+min);
				i++;
				
	}
			
	}

}
