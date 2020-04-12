package itbootcamp.domaci;

import java.util.Scanner;

public class rastuciniz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Napisati program koji ucitava duzinu niza, niz i proverava da li je niz rastuci
		int i = 0;
		System.out.println("Unesi br elemenata niza");
		int n = sc.nextInt();
		int niz[] = new int[n];
		System.out.println("Unesi clanove niza:");
		for(i = 0; i < n;i++)
		{
			niz[i]=sc.nextInt();
			
		}
		
		boolean a = true;	
		for(i = 0; i < n-1;i++)
		{
		if(niz[i] > niz[i+1]) {
			System.out.println("opadajuci");
			a = false;
			break;
		}
		}
		
		if(a != false)
			System.out.println("Rastuci");
		
		
	}

}
