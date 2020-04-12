package itbootcamp.domaci;

import java.util.Scanner;

public class zvezdice {

	public static void main(String[] args) {
		/*Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		 * Hint: koristiti dve for petlje;
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi m:");
		//m je broj zvezidca u kolini
		int m = sc.nextInt();
		System.out.println("Unesi n:");
		//ne je broj kolona
		int n = sc.nextInt();
		for(int i=0 ;i<m;i++) {
			for(int j=0;j<n;j++) { 
				
				System.out.print("*    ");
			}
			System.out.println("");
			System.out.println("");
			
		}
		
		
		
	
	}

}
