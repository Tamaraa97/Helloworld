package itbootcamp.vezbe;
import java.util.Scanner;
public class sumanbr {

	public static void main(String[] args) {
		//suma n brojeva,br nmz negativan,potrebne su dve promenljive
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva zelite da saberete");
		
		
		//ako hocemo while petlju brisemo if i else i on ce vrteti petlju sve dok ne ubode pravu vrednost i onda prelayi na for
		//ako korsitimo while opet treba da unesemo i sc.nextint...
		//pameti samo poslednju vrednost unetu u petlju
		int n = sc.nextInt();
		//ako unesemo 5 dobijemo 5 a ako unesemo -5 dobijemo 5
		if(n<0) {
			int zbir = 0;
		for(int i = 0;i > n;i--) {
			zbir = zbir +i;	
			}
		
		System.out.println("zbir je" + zbir * -1);
	}
		
		else if(n > 0) {
			int zbir = 0;
			for(int i = 0; i <= n; i++) {
				zbir = zbir +i;
		}
			System.out.println("zbir je" + zbir);
		}
		else {
			
			System.out.println("Ispis");
		}

}
}
