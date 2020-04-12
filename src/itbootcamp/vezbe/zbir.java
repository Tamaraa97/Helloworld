package itbootcamp.vezbe;


import java.util.Scanner;
public class zbir {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int zbir;
		zbir = x+y;
		
		System.out.println(zbir);

		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Unesi vrednost varijable br1:");
			int br1;
			br1= sc.nextInt();
			
			System.out.println("Unesi vrednost varijable br2:");
			int br2 = sc.nextInt();
			
			
			/*int zbir2=br1+br2;
			
			System.out.println("zbir je"+ zbir2);*/
			
			boolean rez;
			
			rez=br1 == br2;
			System.out.println(rez);
			
			
			/*System.out.println("unesi svoje ime:");
			String ime = sc.next();*/
			
			
			
			
			
	}

}
