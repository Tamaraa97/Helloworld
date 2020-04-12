package itbootcamp.domaci;

import java.util.Scanner;

public class mesecidomaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
/*Napisati program koji na osnovu unetog naziva meseca ispisuje
 koliko ima meseci u godini koji pocinju na to slovo(na taj glas)*/
		
		System.out.println("Unesi mesec:");
		String mesec = sc.next();
		
		switch(mesec){
		case "januar":
		case "jul":
		case "jun":
			System.out.println("Broj meseci koji pocinju na slovo j je 3");
			break;
		case "februar":
			System.out.println("Broj meseci koji pocinju na slovo f je 1");
			break;
		case "mart":
		case "maj":
			System.out.println("Broj meseci koji pocinju na slovo m je 2");
			break;
		case "april":
		case "avgust":
			System.out.println("Broj meseci koji pocinju na slovo a je 2");
			break;
		case "septembar":
			System.out.println("Broj meseci koji pocinju na slovo s je 1");
			break;
		case "oktobar":
			System.out.println("Broj meseci koji pocinju na slovo o je 1");
			break;
		case "novembar":
			System.out.println("Broj meseci koji pocinju na slovo n je 1");
			break;
		case "decembar":
			System.out.println("Broj meseci koji pocinju na slovo d je 1");
			break;
		default:
			System.out.println("Unesena je pogresna vrednost");
			break;
			
		}
		}
		
	}


