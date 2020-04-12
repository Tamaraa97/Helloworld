package Dete;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dete d1 = new Dete("Luka","Jovic",5);
		Dete d2 = new Dete("Jana","Mitrovic",12);
		Dete d3 = new Dete("Nikola","Mitic",8);
		
		
		d1.dodajKliker();
		d1.dodajKliker();
		System.out.println(Dete.getBrKlikera());
		d2.dodajKliker();
		System.out.println(Dete.getBrKlikera());
		d1.oduzmiKliker();
		System.out.println(Dete.getBrKlikera());
		d3.dodajKliker();
		System.out.println(Dete.getBrKlikera());
	
		
		System.out.println("Prosecan br godina za 3 deteta"+ d1.prosecneGod());		
	}

}
