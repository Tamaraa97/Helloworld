package itbootcamp.domaci;
import java.util.Scanner;
public class lift {

	public static void main(String[] args) {
	/*1.U zgradi se nalazi lift nosivosti 680kg. 
	 * Napisati program koji proverava da li ce lift bezbedno krenuti u zavisnostii od tezine koju treba da ponese.
	 *  Podrazumevane 3 opcije:
	 *  Lift je preopterecen; 
	 *  Na granici je;
	 *   Lift je pokrenut */
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Unesite tezinu:");
	 int tezina = sc.nextInt();		
	 int nosivost = 680;
		
		if(tezina > nosivost) {
			System.out.println("Lift je preoptereæen");
		}
		else if(tezina == nosivost) {
			System.out.println("Na granici je");
		}
		else if(tezina <= 0) {
			System.out.println("Lift nece krenuti");
		}
		else {
			System.out.println("Lift je pokrenut");
		}

	}

}
