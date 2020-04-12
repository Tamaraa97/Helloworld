package itbootcamp.vezbe;

import java.util.Scanner;

public class velikaumalaslova {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*rec napisanu velikim slovima prepravlja u mala i od njih kreira recenicu na kraju unosom reci stop*/
		
		
		String rec;
		String svereci = "";//povezuje reci u recenicu
		String recmalim;// rec prebacujemo u mala slova
		
		do {
			System.out.println("Unesi rec velikim slovom");
			rec = sc.next();
			
			recmalim = rec.toLowerCase();// prebacuje rec u mala slova
			System.out.println(recmalim);
			
			if(!recmalim.equals("stop")) { // uzvicnik je suprotno od onog sto je napisano u komandi
				svereci = svereci + recmalim + " ";
			}
		}while(!"stop".equals(recmalim));
		System.out.println(svereci + ".");
	}

}
