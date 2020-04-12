package itbootcamp.vezbe;

import java.util.Scanner;

public class povrsinakruga {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi vrednost promenljive r:");
		int r;
		r=sc.nextInt();
		
		System.out.println("Povrsina je:");
		double povrsina=r*r*3.14;
		System.out.println(povrsina);
		
	}

}
