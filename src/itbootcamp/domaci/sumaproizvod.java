package itbootcamp.domaci;

import java.util.Scanner;

public class sumaproizvod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva 
		 * od 0 do n - 
		 * za resavanje ovog zadatka koristiti samo jednu petlju
		 *  (ne jednu vrstu petlje, vec samo jednu petlju).
		 */
		System.out.println("Unesi n");
		int n = sc.nextInt();
		int suma=0;
		int i=0;
		int pro = 1;
		int j = 1;
		
		
		while(i <= n && j <=n) {
		 if(n%2 == 0) {
			 suma = suma + i; 
			 i++; 	 
		 }
		 else {
			 pro = pro *j;
			 j++;	
			
		 }
		 
		}
		System.out.println("Suma je" + suma);
		 System.out.println("proizvod" + pro);
	}
}

