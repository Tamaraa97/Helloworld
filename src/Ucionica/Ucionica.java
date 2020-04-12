package Ucionica;




public class Ucionica {
	
	public static void main(String[] args) {  
	    Polaznik p1 = new Polaznik("Jelena", "Obradovic");
        Polaznik p2 = new Polaznik("Pera", "Peric");
        Polaznik p3 = new Polaznik("Mirko", "Mirkovic");
        Polaznik p4 = new Polaznik("Janko", "Jankovic");
        
        
        Laptop l1 = new Laptop("Lenovo");
        Laptop l2 = new Laptop("HP");
        Laptop l3 = new Laptop("Dell");
        
		l1.dodajPolaznika(p4);
		l2.dodajPolaznika(p2);
		l3.dodajPolaznika(p1);
		l3.dodajPolaznika(p3);
		l3.dodajPolaznika(p4);
		
		System.out.println(l2.toString());
		System.out.println(l3.toString());
		
		}
}
