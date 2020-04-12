import java.util.Arrays;

public class Sortiranjeniza {

	public static void main(String[] args) {
		//pozicije su 0,1,2,3,4
	int n[]={10,0,-10,2,-20};
	/* proverava da li je clan niza manji od prethodnog,ako jeste postavlja ga na prvu poziciju,to poziciju iskljucuje gleda ostatak niza i sledecu najmanju
	 * sada postavlja na drugo mesto,i tako radi dok se ne dodje do poslednjeg clana niza
	 * koristimo dupplu petlju jer se vrse preskakanja za vrednosti koja su vec def, taj broj koji se zamenjuje menjaju se i ta mesta indeka,znaci samo se vrsi zamena
	 * */
	
	//cuva poslednji ulazak u petlju minimum je -20,pozicija je 4
	//kada je i=0,vrednost je 10,pozicija je 0,minimum je n[0] a to je 10 u nasem primeru,proverava dalje petlju kaze da je j=0,ako je n[0]manje od min,j dodaje vrednost 1,
/*	for(int i=0;i <  n.length;i++) {
		int poz = i;
		//definisemo poziciju i vrednost
		int min = n[i];
		//ovom petljom se ne proveravaju vrednostima kojima su vec odredjeni minimumi,kada je j=i,for petlje mora da bude u drugoj for petlji
		//u drugoj petlji trazi minimalnu vrednost,
		for(int j=i;j < n.length;j++) {
			//sve vreme se menja j
			//proveravamo da li je vrednost clana n[j] manje od minimuma,ako jeste poz=j,a min je dodata nova vrednost,kada su ispunjeni svi uslovi opet se vracamo na prvu
			if(n[j] < min) {
				poz = j;
				min = n[j];
				
			}
		}
		//minimum se stavlja na poziciju 0,a pooziciju niza stavljamo na mesto gde smo clan niza pomerili
		//napravili smo promenljivu temp i dodelili smo joj vrednost prvog clana niza
		//n0=-20,a n4=10,temp je privremena promenljiva dok se ne zamene mesta
		//indeksi ostaju isti,samo se menjaju vrednosti
		int temp = n[i];
		n[i] = n[poz];
		n[poz] = temp;	
	}
	//ispisuje clanove niza,posto je 0 na prvoj poziciji,onda je i=1
	//ova metoda pretvara niz u string i samo ce da ga otkuca u konzoli,uglaste zagrade u konzoli stoje zato sto ga ova metoda tako definise,ako damo int kao u nasem slucaju,definisemo ustv kojeg je tipa nas niy
	System.out.println(Arrays.toString(n));*/
	/*Arrays.sort(n, 1, 3); ova metoda sortira niz od 1 do 3 clana,sto znaci da uzima prva dva clana,radi na osnovu indeksa tj od indeksa 1 do indeksa 3*/
	Arrays.sort(n);
	System.out.println(Arrays.toString(n));
	
	}

	}


