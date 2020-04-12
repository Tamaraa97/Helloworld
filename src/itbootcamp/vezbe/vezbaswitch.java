package itbootcamp.vezbe;

import java.util.Scanner;

public class vezbaswitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch(x) {
		case 3:
		case 5:
			System.out.println("B");
			break;
			
		default:
			System.out.println("Suprotno");
			break;
		
		case 0:
			System.out.println("C");
			break;
		}
		
	}

}
