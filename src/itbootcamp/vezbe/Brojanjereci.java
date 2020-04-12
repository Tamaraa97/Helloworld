package itbootcamp.vezbe;

import java.util.Scanner;

public class Brojanjereci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String recenica = sc.nextLine();
		//split deli recenicu na celine tj.elemente,metoda se koristi samo kod stringa
		String reci[] = recenica.split(" ");
		
		int broj = 0;
		
		for(int i = 0;i < reci.length;i++) {
			//clan niza def kao jednu string promenljivu i nazivamo je rec
			//recenica koju izaberemo od nje pravi niz od broja clanova gde su razmaci,"Lepa su vremena",dobijamo lepa,su,vremena tj 3 niza
			//rec sa indeksom 0 je lepa,sa 1 su,sa 2 su vremena,stavljamo i sto znaci da i dobija vrednosti koliko ima clanova niza
			String rec = reci[i];
			/*charAt metoda trazi indeks, i oznacava karakter na poziciji koji mi njemu dajemo,
			 * karakter je svako slovo u reci,indeksi karaktera idu takodje od nule zato ide -1,'a' je karakter,ponasa se
			 * isto kao kod niza,
			 */
			if(rec.charAt(rec.length()-1)== 'a') {
				broj++;
			
			}
		}
		/*System.out.println("ima" + broj+"reci koje se zavrsavaju na a");
		reci = recenica.split("a ");
		System.out.println(reci.length-1);*/

	}

}
