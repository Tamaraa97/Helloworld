package itbootcamp.vezbe;

import java.util.Scanner;

public class uporedjivanjestring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text1 = sc.nextLine();
		System.out.println(text1);
		String text2 = sc.next();
		System.out.println(text2);

			/*if(text1.equals(text2)){
				System.out.println("String je isti");
			}else {
				System.out.println("String je razlicit ");
			}*/
		
		/*if(text1.contains(text2)) {
			System.out.println("text2 je deo ");
		}
		else {
			System.out.println("nije deo");
		}*/
			
		if(text1.endsWith(text2)) {
			System.out.println("text1 se zavrsava sa text2");
		}
		else {
			System.out.println("vrednosti se ne podudaraju");
		}
			
	}
}


