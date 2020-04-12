package itbootcamp.domaci;
import java.util.Scanner;
public class domacibr1 {

	public static void main(String[] args) {
		
		//deklaracija sa inicijalizacijom-int
	Scanner sc = new Scanner(System.in);
		System.out.println("Celobrojna vrednost");
		int x=10;
		System.out.println(x);
		
		//deklaracija sa inicijalizacijom-float
		System.out.println("Broj sa decimalnom tackom");
		float y=22425.12f;
		System.out.println(y);
		
		//deklaracija sa inicijalizacijom-double
		System.out.println("Ispisi broj sa decimalnom tackom:");
		double z=3378.12;
		System.out.println(z);
		
		//boolean vrednost jednako
		boolean rezultat;
		System.out.println("Unesi vrednost za c i d:");
		int c;
		c=sc.nextInt();
		int d;
		d=sc.nextInt();
		rezultat = (c == d);
		System.out.println(rezultat);
		
		//boolean vrednost razlicito 
		boolean rezultat1;
		System.out.println("Unesi vrednost za c1 i d1:");
		int c1;
		c1=sc.nextInt();
		int d1;
		d1=sc.nextInt();
		rezultat1=(c1 != d1);
		System.out.println(rezultat1);
		
		//boolean vrednost vece jednako 
		boolean rezultat2;
		System.out.println("Unesi vrednosti za c2 i d2");
		int c2;
		c2=sc.nextInt();
		int d2;
		d2=sc.nextInt();
		rezultat2=(c2 >= d2);
		System.out.println(rezultat2);
		
		//boolean vrednost manje jedanko
		boolean rezultat3;
		System.out.println("Unesi vrednost za c3 i d3:");
		int c3;
		c3 = sc.nextInt();
		int d3;
		d3 = sc.nextInt();
		rezultat3=(c3 <= d3);
		System.out.println(rezultat3);
		
		//boolean vrednost vece
		boolean rezultat4;
		System.out.println("Unesi vrednost za c4 i d4:");
		int c4;
		c4=sc.nextInt();
		int d4;
		d4=sc.nextInt();
		rezultat4=(c4 > d4);
		System.out.println(rezultat4);
		
		//deklaracija sa inicijalizacijom-char
		System.out.println("Znakovni tip");
		char slovo='T';
		System.out.println(slovo);
		
		//string-poseban tip varijable
		System.out.println("Ispisi string:");
		String ime="Tamara Pecnik";
		System.out.println(ime);
		
		//sabiranje stringova
		System.out.println("Ime i prezime:");
		String ime1="Tamara";
		String prezime1="Pecnik";
		String imeprezime= ime1+prezime1;
		System.out.println(imeprezime);
		
		System.out.println("Unesi dva broja:");
		int a;
		a=sc.nextInt();
		int b;
		b=sc.nextInt();
		int zbir=a+b;
		System.out.println("Zbir je"+zbir);
		
		int delj=a/b;
		System.out.println("Rezultat deljenja je"+delj);
		
		int ost=a%b;
		System.out.println("Ostatk pri deljenu je"+ost);
		
		int oduzimanje=a-b;
		System.out.println("Rezultat oduzimanja je"+oduzimanje);
		
		int mnz=a*b;
		System.out.println("Rezultat mnozenja je"+mnz);
		
		//Zadatak:Povrsina i obim bazena
		System.out.println("Unesi vrednost promenljive stranica1:");
		int stranica1;
		stranica1=sc.nextInt();
		System.out.println("Unesi vrednost stranice2:");
		int stranica2;
		stranica2=sc.nextInt();
		System.out.println("Obim je:");
		int o=2*stranica1+2*stranica2;
		System.out.println(o);
		System.out.println("Povrsina je:");
		int p=stranica1*stranica2;
		System.out.println(p);
		
				
	
	}

}
