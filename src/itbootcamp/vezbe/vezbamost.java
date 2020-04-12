package itbootcamp.vezbe;
import java.util.Scanner;
public class vezbamost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite vrednost mase i nosivosti:");
		
		double nosivost= sc.nextDouble();
		double masa= sc.nextDouble();
	
		if(nosivost > masa)
		{
			System.out.println("Svi na mostu su bezbedni.");
		}
		else if(nosivost == masa)
		{
			System.out.println("Granicna vrednost");
		}
		else
		{
			System.out.println("Nosivost ne sme da bude manja od mase");
		}
		}
	}


