package itbootcamp.domaci;

import java.util.Scanner;

public class Sahovskatabla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int red=1;
		int kolona=1;
		int red1=1;
		int kolona1=1;
		//pocetna pozicija za crnog skakaca je ili na poziciji (1,2) ili na poziciji (1,7)
		//skakac se krece dva polja napred,pa jedno polje ili levo ili desno,
	
		
		System.out.println("Unesi poziciju crnog skakaca,u obliku (red,kolona)");
	
			red = sc.nextInt();
			kolona = sc.nextInt();
			System.out.println("Crni skac se nalazi na poziciji("+ red+","+kolona+")" );	
		
		
		//bilo gde u drugom sedmom redu mogu biti postavljeni(u 7 redu zato sto se krece sa donje strane tabel)
		//u startu se pomeraju za 2 pola napred u svim ostalim slucajevima za po 1 polje
		System.out.println("Unesi"+ " poziciju belog pesaka,u obliku(red,kolona)");
		red1 = sc.nextInt();
		kolona1 = sc.nextInt();
		System.out.println("Beli pesak se nalazi na poziciji("+ red1+","+kolona1+")" );
		//ako uzmemo pocetnu poziciju skakaca (1,7)
		if((red1 == 4 && kolona1 == 2) && (red==3 && kolona == 3)) {
			System.out.println("Skakac je napadnut");
		}
			else if((red1 == 2 && kolona1 == 2) && (red==1 && kolona == 1)) {
				System.out.println("Skakac je napadnut");
			}
			else if((red1 == 6 && kolona1 == 4) && (red==5 && kolona == 5) || (red1 == 6 && kolona1 == 6) && (red==5 && kolona ==5)) {
				System.out.println("Skakac je napadnut");
			}
			else if((red1 == 6 && kolona1 == 2) && (red==5 && kolona == 1)) {
				System.out.println("Skakac je napadnut");
			}
			else if((red1 == 5 && kolona1 == 1) && (red==4 && kolona == 2)) {
				System.out.println("Skakac je napadnut");
			}
			else if((red1 == 5 && kolona1 == 3) && (red==4 && kolona ==2)) {
				System.out.println("Skakac je napadnut");
			}
			else if((red1 == 5 && kolona1 == 3) && (red== 4 && kolona == 4)) {
				System.out.println("Skakac je napadnut");
			}
			else if((red1 == 5 && kolona1 == 5) && (red==4 && kolona ==4)) {
				System.out.println("Skakac je napadnut");
			}
			else if((red1 == 4 && kolona1 == 5) && (red==3 && kolona ==6)) {
				System.out.println("Skakac je napadnut");
			}
			else if((red1 == 4 && kolona1 == 7) && (red==3 && kolona ==6)) {
				System.out.println("Skakac je napadnut");
			}
			else if((red1 == 3 && kolona1 == 4) && (red==2 && kolona ==5)) {
				System.out.println("Skakac je napadnut");
			}
			else if((red1 == 3 && kolona1 == 6) && (red==2 && kolona ==5)) {
				System.out.println("Skakac je napadnut");
			}
			else if((red1 == 2 && kolona1 == 6) && (red==1 && kolona ==7)) {
				System.out.println("Skakac je napadnut");
			}
			else if((red1 == 2 && kolona1 == 8) && (red==1 && kolona ==7)) {
				System.out.println("Skakac je napadnut");
			}
			else if((red1 == 4 && kolona1 == 7) && (red==3 && kolona ==8)) {
				System.out.println("Skakac je napadnut");
			}
		else{
			System.out.println("Skakac nije napadnut");
		}
		
	}

}
