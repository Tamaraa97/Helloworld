package Zadatak1;

public class GlavniProgram {

	public static void main(String[] args) {
		/*U Glavnom programu kreirati Mauntinbike koji ima 3 brzine,
		 *  bzinu od 100km/h I visinu sedista podesenu na 25cm. 
		 *  Ispisati u konzoli ovaj Mauntinbike. */

		
		MountainBike b1 = new MountainBike("pedale postoje",0, 0, 0);
		System.out.println(b1.getVisinaSedista());
		//podesavamo menjac na broj 3,sto znaci da postoje 3 brzine
		b1.setMenjac(3);
		//podesavamo brzinu na 100 km/h
		b1.setBrzina(100);
		//podesavamo visinu sedista na 25cm
		b1.setVisinaSedista(25);
		System.out.println(b1);
		
		System.out.println(b1.getVisinaSedista());
		
		b1.ubrzaj();
		System.out.println(b1);
		
		b1.uspori();
		System.out.println(b1);
	}

}
