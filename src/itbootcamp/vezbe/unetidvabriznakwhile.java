package itbootcamp.vezbe;

import java.util.Scanner;

public class unetidvabriznakwhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi x");
		int x = sc.nextInt();
		System.out.println("Unesi y");
		int y = sc.nextInt();
		System.out.println("znak:");
		int z = sc.nextInt();
		
	while(z != 5) {
		switch(z) {
		case 1:
			System.out.println("Zbir je" + (x+y));
			break;
		case 2:
			System.out.println("Razlika je" + (x-y));
			break;
		case 3:
			System.out.println("Mnozenje"+ (x*y));
			break;
		case 4:
			if(y != 0) {
			System.out.println("Deljenje" + (x/y));
			}
			else {
				System.out.println("Nije dozvoljeno deljenje nulom");
			}
			break;	
		default:
			System.out.println("Unesen br koji je razlicit od 5 ");
			break;
		}	
		
		break;
		}
	
	}
}

	



