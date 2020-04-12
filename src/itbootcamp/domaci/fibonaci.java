package itbootcamp.domaci;

import java.util.Scanner;

public class fibonaci {

	public static void main(String[] args) {
		//Napisati program koji ce ispisati n brojeva Fibonacijevog niza
		//svaki clan je zbir prethodna dva clana
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi broj n:");
		int n = sc.nextInt();
		int x1= 0;
		int x2= 1;
		int y;
		
		for(int i=0;i<=n;i++) {
		
				y=x1;
				x1=x2;
				x2 = y + x2;
				System.out.println(x2);
		}
	
		}
		
		}
		
	

		

	

