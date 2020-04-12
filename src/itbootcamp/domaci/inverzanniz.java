package itbootcamp.domaci;

import java.util.Scanner;

public class inverzanniz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		System.out.println("Unesi br elemenata niza");
		int n = sc.nextInt();
		int niz[] = new int[n];
		System.out.println("Unesi clanove niza:");
		for(i = 0; i < n;i++)
		{
			niz[i]=sc.nextInt();
			
		}
		
		for(int j = n-1; j >= 0;j--) {
			System.out.print(niz[j]+",");
		}
				
		}
		
		
	}


