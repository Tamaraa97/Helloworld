package Flasa;

import java.util.ArrayList;

public class GlavniPro {
/*Flaša piæa ima naziv, jednoznaèni automatski generisan indetifikator, cenu bez kaucije, zapreminu. 
 * Svi podaci se zadaju prilokom stvaranja i mogu da se dohvate, a jedino cena može da se i promeni.
 *  Na glavnom izlazu se ispisuje u obliku „naziv: indetifikator, cena din, zapremina l“*/
	
	/* Staklena flaša piæa je flaša piæa kod koje se cena sa kaucijom raèuna tako što se na cenu bez kaucije doda 5% od cene ukoliko je zapremina manja od 0,5l, 
	 * ili se doda 10% od cene ukoliko je zapremina vaæa ili jednaka od 0,5l. 
	 * Na glavnom ekranu se ispisuje flaša – staklena. */
	
	/* Plastièna flaša je flaša gde je cena sa kaucijom jednaka ceni bez kaucije. Na glavnom izlazu se ispisuje flaša – plastièna.*/
	
	/*Glavni Program – napraviti listu plastiènih flaša i listu staklenih flaša. U svaku ubaciti nekoliko objekata. 
	 * Izraèunati raèun za kupljeno piæe, pri èemu se raèunaju cene sa kaucijom za staklene flaše a bez za plastiène(ista je cena i sa i bez kaucije)
	 *  Nije potrebno koristii Scanner klasu. */
	

	public static void main(String[] args) {
		ArrayList<Flasa> inventar = new ArrayList<Flasa>();
		Flasa p1 = new PlasticnaFlasa( "coca cola",1, 60,0,0);
		System.out.println(p1.getCenaBez()); //cena bez je ista kao i cena sa
		Flasa p2 = new PlasticnaFlasa("tuborg",2,55, 0, 0);
		System.out.println(p2.cenaBez);
		Flasa p3 = new PlasticnaFlasa("Zajecarsko",3, 135,2, 0);
		System.out.println(p3.cenaBez);
		Flasa s1 = new StaklenaFlasa("sprajt",4, 82, 0,0);
		
		Flasa s2 = new StaklenaFlasa("Lav",5, 87,1,0);
		Flasa s3 = new StaklenaFlasa("jelen",6, 97,0.5,0);
		
		System.out.println(s1.getNaziv());
		
	}

}
