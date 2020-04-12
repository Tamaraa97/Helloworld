package itbootcamp.domaci;

import java.util.Scanner;

public class palindromniz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//proveriti da li je niz palindrom i ispisati poruku
		//niz 12321 je palindrom,dok niz 12345 nije palindrom
		
		int i;
		int niz1[] = new int[5];
		System.out.println("Unesi niz :");
		for(i=0; i < niz1.length; i++) {
			niz1[i] = sc.nextInt();
		
		}
		
		for(i=0; i<niz1.length/2; i++) {
			if(niz1[i] != niz1[niz1.length-1-i]) {
			break;
			}
		}
		
		if(i ==(niz1.length)/2) {
			System.out.println("Niz je palindrom");
		}
		else {
			System.out.println("Niz nije palindrom");
		}

	}

}
