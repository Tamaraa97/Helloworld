package itbootcamp.vezbe;

import java.util.Scanner;

public class vezba4for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// napisati program koji racuna zbir cifara dvocifrenog broja i postaviti uslov ako korisnik unese negativan br da se pretvori u poyitiva

		System.out.println("Unesi broj");
		int n = sc.nextInt();
		
		if(n >= 0) {
		int j = n % 10;
		System.out.println("jedinice" + j);
		
		int d = n / 10;
		System.out.println("desetice" + d);
		
		int zbir = j + d;
		System.out.println("zbir je" +zbir);
		}
		
		else
		{	
			
		n = n * -1;
		System.out.println("pozitivan" + n);
			
		}
		
		
	}

}
