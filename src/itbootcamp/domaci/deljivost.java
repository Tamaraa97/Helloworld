package itbootcamp.domaci;

public class deljivost {

	public static void main(String[] args) {
		/*Napisati program koji ce prebrojati koliko je brojeva od 9 do 250 (ukljucujuci i njih) deljivih brojem 3*/
		//broj je deljiv sa 3 ako mu je zbir cifara deljiv sa 3
	
		
		
		
		int j=0;
		for(int i = 9;i <=250;i++) {
			if(i%3 == 0) {
				System.out.println(i);	
				j = j+1;
				System.out.println("Broj i koji je deljiv sa 3 je"+" " +j);
				
			}
			else {
				i++;
			}
			
			
		}
		
		System.out.println(" ");
	}

}
