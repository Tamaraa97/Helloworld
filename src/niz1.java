import java.util.Scanner;

public class niz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n[] = {10, 4, 5, 12, 22, 2, 10 };
		
		for(int i=0; i< n.length;i++) {
			
			if(i == n.length-1) {
			System.out.println(n[i]);
			}
			else {
			System.out.print(n[i]+", ");
			}
		
		//poslednji clan niza n-1
		
		/*for(int i = 0;i<n.length;i++) {
			System.out.println(n[i] + ",");
		}
		System.out.print(n[n.length-1]);*/
		
		
		}
	}

}
