package itbootcamp.vezbe;

public class inkrementidek {

	public static void main(String[] args) {
	int a = 10;
	int b = 15;
	
	++a;//ppovecana vrednost za 1
	/* a++ povecava vrednost za 1 ali racuna originalnu vrednost*/
	/* --b;
	int c = a+b;
	int d = a++ + --b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);*/

	
	int x = 20;
	int y = 5;
	x = x++ + --y + x + y-- + ++x;//20+4+4+22,70
	//pisem 20 pamtim 21
	//nova vrednost je 4
	//pisem 4 pamtim 3
	//nova vrednost je zapamceno + 1 = 22
	System.out.println(x);
	System.out.println(y);
	}

}
