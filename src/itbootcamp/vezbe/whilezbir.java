package itbootcamp.vezbe;

import java.util.Scanner;

public class whilezbir {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite vrednost za i");
		
		int n = sc.nextInt();
		
		if(n > 0) {
		int i = 1;
		int zbir = 0;
			
		while(i <= n ) {
			zbir = zbir + i;
			i = i+1;
			}
		
		System.out.println("Vrednost za zbir je" + zbir);
		}
		else {
			System.out.println(" Unet je negativan br");
		}
		
		}
	}


