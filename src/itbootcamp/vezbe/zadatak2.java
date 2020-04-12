package itbootcamp.vezbe;

import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*Ukoliko kupac kupi robu u iznosu veæem od 1500 dinara, dobija 10% popusta,
		a ukoliko kupi robu u iznosu veæem od 7000 dinara dobija 20% popusta.
		Napisati program koji æe za uneti iznos odabrane robe ispisati koliko zapravo treba platiti.*/
		System.out.println("unesi cenu robe");
		double iznos = sc.nextDouble();
		double cenasapopu;
		double popust;
		
		while(iznos<0) {
			System.out.println("Iznos mora biti pozitivan,unesi broj ponovo:");
			iznos = sc.nextInt();
		}		
		if(iznos>=0.0) {
		if(iznos>1500 && iznos <=7000) {
			popust=(iznos*10)/100;
			cenasapopu = iznos - popust;
			System.out.println("Cena koju treba platiti je" + cenasapopu);
		}
		else if(iznos>7000) {
			popust=(iznos*20)/100;
			cenasapopu = iznos - popust;
			System.out.println("Cena koju treba platiti je" + cenasapopu);
		}
		else {
			System.out.println("Cena je" + iznos);
		}
		}
		
		
	}

}
