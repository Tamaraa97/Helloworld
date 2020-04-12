package itbootcamp.vezbe;

import java.util.Scanner;

public class obimipov {

	public static void main(String[] args) {
		
	//obim 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi vrednost za promenljivu a");
		int a;
		a=sc.nextInt();	
		
		
		System.out.println("Unesi vrednost za b:");
		int b;
		b=sc.nextInt();
		
		System.out.println("Unesi vrednost za c:");
		int c;
		c=sc.nextInt();
		
		int obim = a+b+c;
		System.out.println("Obim je:");
		System.out.println(obim);
		
		
		//obim jednakostra.,vec deklarisano a
		System.out.println("Obim2 je:");
		int obim2=3*a;
		System.out.println(obim2);
		
		//P=a*b/2
		
		System.out.println("Povrsina je");
		int povrsina=(a*b)/2;
		System.out.println(povrsina);
		
		
	}

}
