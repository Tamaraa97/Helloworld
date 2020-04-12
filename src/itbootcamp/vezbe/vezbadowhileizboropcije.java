package itbootcamp.vezbe;

import java.util.Scanner;

public class vezbadowhileizboropcije {

	public static void main(String[] args) {
	/*Pomocu do while petlje napisati program koji omogucava korisniku da unosom odgovarajuceg broja bira sledece opcije:
	 * 1.Provera stanja, 2.Podizanje novca,3.Uplata,0.Kraj
	 * Provera stanja -> Ispisati korisniku koliko trenutno ima novca na racunu. Pri pokretanju programa stanje je 0.
	 * */

		Scanner sc = new Scanner(System.in);
		
		
		int stanje=0;
		int x;
		
	do{
		System.out.println("Unesi broj od 0 do 3 za izbor opcije");
		 x = sc.nextInt();
		switch(x) {
		case 1:
			System.out.println("Trenutno stanje racuna je" + stanje);
			break;
			
		case 2:
			System.out.println("Iznos koji zelimo da podignemo:");
			int iznosp = sc.nextInt();
			if(iznosp < stanje && iznosp >0) {
				stanje = stanje - iznosp;
				System.out.println("Trenutno stanje racuna je" + stanje);
				System.out.println("Novac je uspesno podignut i vrednost stanja je smanjena za taj iznos");	
			}
			else {
				System.out.println("Nije moguce podignuti novac jer je trenutno stanje manje od unetog iznosa");
			}
			break;
		case 3:
			System.out.println("Iznos za uplatu:");
			int uplata = sc.nextInt();
			if(uplata>0) {
				stanje = stanje + uplata;
				System.out.println("Stanje na racunu je" + stanje);
				System.out.println("Uspesno je novac dodat na racun");
				break;
			}
			else {
				System.out.println("Iznos za uplatu mora da bude veci od nule");
				break;
			}
		case 0:
			System.out.println("kraj");
			break;
		default:
			System.out.println("Izabrana je pogresna opcija");
			break;
		}	
	}while(x!=0);
	System.out.println("Novac na racunu mora da postoji");
	}
	}
	
	

	

