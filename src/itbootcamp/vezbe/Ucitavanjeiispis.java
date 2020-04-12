package itbootcamp.vezbe;

import java.util.Scanner;

public class Ucitavanjeiispis {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			int [] brojevi = new int[10];
			
			for(int i = 0;i < 10; i++) {
				System.out.println("Unesi br");
				brojevi [i] = sc.nextInt();	
			}
			//ako je u zagradam ime var moze da se pon
			for (int j=0; j<10; j++) {
				System.out.println(brojevi[j] + ", ");
			}
	}
}
