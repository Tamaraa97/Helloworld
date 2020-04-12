package itbootcamp.vezbe;

import java.util.Scanner;

public class javadani {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi mesec:");
		int x = sc.nextInt();

		switch(x) {
		case 1:
			System.out.println("janur/Broj dana je 31.");
			break;
			
		case 2:
			int godina = sc.nextInt();
			if(godina % 4 == 0 && godina % 100 !=0) {
				System.out.println("februar/Broj dana je 29.");
			}
			else {
				System.out.println("Broj dana je 28");
			}
			break;
			
		case 3:
			System.out.println("mart/Broj dana je 31");
			break;
			
		case 4:
			System.out.println("april/Broj dana je 30");
			break;
			
		case 5:
			System.out.println("maj/Broj dana je 31");
			break;
			
		case 6:
			System.out.println("jun/Broj dana je 30");
			break;
			
		case 7:
			System.out.println("jul/Broj dana je 31");
			break;
			
		case 8:
			System.out.println("avgust/Broj dana je 30");
			break;
			
		case 9:
			System.out.println("septembar/Broj dana je 30");
			break;
			
		case 10:
			System.out.println("oktobar/Broj dana je 31");
			break;
			
		case 11:
			System.out.println("nvembar/Broj dana je 30");
			break;
			
		case 12:
			System.out.println("decembar/Broj dana je 31");
			break;
		default:
			System.out.println("Pogresno");
			break;
		}
		}
	}


