package itbootcamp.domaci;

import java.util.Scanner;

public class sabiranje {

	public static void main(String[] args) {
		/*Napisati program koji unosi i sabira brojeve dokle god nije unesen 
		negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
        primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11*/
		
		Scanner sc = new Scanner(System.in);
		int zbir = 0;
	int br;
		do {
			System.out.println("Unesi br");
			br = sc.nextInt();
			if(br>0) {
			zbir = zbir + br;
			System.out.println("Zbir je" +zbir);
			}
			else { 
			System.out.println("zbir" +zbir);
			}
		}while(br!=0);
		System.out.println("Zbir je" +zbir);
		}
	
	
}
