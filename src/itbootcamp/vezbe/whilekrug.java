package itbootcamp.vezbe;

import java.util.Scanner;

public class whilekrug {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite poluprecnik kruga");
		float r = sc.nextFloat();
		
		while(r <= 0) {
			System.out.println("Unesite pozitican broj");
			r = sc.nextFloat();
		}
		
		System.out.println("Povrsina kruga je" + r*r*3.14);
		}

	}


