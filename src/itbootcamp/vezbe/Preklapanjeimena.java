package itbootcamp.vezbe;

public class Preklapanjeimena {
	
	
	//imena varijabli def unutar metode,vaze samo unutar te metode, mogu da se ponavljaju unutar drugih metoda
	public static int saberi1(int a,int b) {
		return a+b;
	}
	
	public static int saberi(int a,int b,int c) {
		return a+b+c;
	}
	//posto je drugaciji tip,npr jednom string jedno float,i stavimo isto ime metode nece praviti problem
	//ako imamo razliciti broj argumenata u metodi, opet moze isto ime cak i sa istim tipom
	public static String saberi(String a, String b) {
		return a+b;
	}
	
	public static String saberi2(int x, int y) {
		//posto smo definisali komb stringa i brojeva u return zato radi,a da smo isto def metodu,a izbrisali string,pojavila bi se greska
		return "Rezultat je"+(x+y);
	}
	
	public static void main(String[] args) {
		
		saberi1(1, 2);
		System.out.println(saberi1(1,2));
		
		saberi(2, 5, 10);
		System.out.println(saberi(2, 5, 10));
		
		saberi("Tamara", "Jovana");
		System.out.println(saberi("Tamara", "dhsh"));
		
		saberi2(5,6);
		System.out.println(saberi2(5,6));
	}

}
