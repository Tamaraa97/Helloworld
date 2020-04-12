package itbootcamp.vezbe;

public class Vrednostireferenca {
	
	public static int saberi(int x,int y) {
		int c;
		c= x+y;
		return c;
	}
	
	public static char postaviNaA(char ch) {
		//sintaksa moze da bude i bez ovog dela ch='a'
		//ch='a';
		return ch;
	}

	public static void main(String[] args) {
		//ispisuje b
		char slovo ='b';
		System.out.println(slovo);
		// ovo x nije isto kao ono definisano u metodi,ono sto se desi u metodi ostaje u metodi
		int x = 5;
		int c = 12;
		int z = 20;
		//uzima x iz main metode,znaci 5
		//linearno prolazi kroz main,kao zbir ispisuje 11
		System.out.println(saberi(x,6));
		//daje vrednost 5 kao rezultat
		System.out.println(x);
		//daje 12 kao rezultat
		System.out.println(c);
		
		
	}

}
