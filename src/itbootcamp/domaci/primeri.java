package itbootcamp.domaci;



public class primeri {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		//prefiksni ++
		//sto znaci da se operand menja pre nego sto se njegova vrednost koristi, u ovom primeru vrednost za x ce biti 11.
		int x=++a;
		System.out.println("Vrednost za x:"+x);
		/*y=(20+1)-(11+1)+(30+1)
		 * y=21-12+31=40,vrednost za a=x++(11+1),b=b+1,c=c+1
		*/
		int y = ++b - ++a + ++c;
		System.out.println("Vrednost za y:"+y);
		
		
		//prefiksni --
		//vrednost koju dobijamo je vrednost iz prethodnog primera gde je b=21,kad pokrenemo ovu liniju koda dobijamo da je b=20
		int z=--b;
		System.out.println("Vrednost za z:"+z);
		//z=(31-1)-(20-1)=30-19=11,31 je broj koji smo dobili za b kod y jednacine,a 20 iz z
		z= --c - --b;
		System.out.println("Razlika je"+z);
		
		
		//postfiksni ++,ovde se prvo koristi vrednost operanda,pa se onda on inkrementira
		//vrednost za j je 30,na osnovu izraza z iz prethodnog zadatka,gde je c bilo takodje 30
		int j = c++;
		System.out.println("Vrednost za j:"+j);
		//j=31+19-12=38,c++ je vrednost koja je sad iz prethodne j jednacine uvecana za 1 pa je zato 31,c je i dalje 19 kao u jednacini z,a a je iz jednacine y koriscena i vrednost je 12
		j = c++ + b++ - a++;
		System.out.println("Vrednost jednacine j je"+j);
		
		
		//postfiksni --,uzima se prvo vrednost operanda,pa se onda dekrementira
		//vrednost a se uzima iz jednacine j uvecana za 1,sto znaci da je ona sada 13
		int i = a--;
		System.out.println("Vrednost za i je:"+i);
		/*i=12+20=32,a je u ovom slucaju 12 jer iz prethodne i jednacine smanjujemo vrednost a za 1,jer ponovo koristimo istu vrednost
		 * a prosli put ona nije bila umanjena za 1,i b je 20 jer je u jednacini j bila vrednost 19 i koriscen je postfiksni inkrement sto znaci da je u sledecoj upotrebi
		 * te promenljive vrednost trebala da se uveca za 1
		 */
		i = a-- + b--;
		System.out.println(i);
	}

}
