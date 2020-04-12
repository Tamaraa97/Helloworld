package itbootcamp.domaci;

import java.util.Scanner;

public class ucitavanjenizadomaci1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("Unesi br elemenata niza");
		int n = sc.nextInt();
		int niz[] = new int[n];
		System.out.println("Unesi br");
		int br = sc.nextInt();
		if(br > 0) {
		System.out.println("Unesi clanove niza:");
		for(i = 0; i < niz.length;i++)
		{
			niz[i]=sc.nextInt();
			
		}
		
		for(i = 0; i < niz.length;i++) {
			if(niz[i] % br == 0)
				System.out.print(niz[i] + ",");
			
		}
		}
		else
		{
			System.out.println("Uneli ste negativan br");
		}
		
		

	}

}
