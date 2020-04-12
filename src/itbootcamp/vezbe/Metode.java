package itbootcamp.vezbe;

public class Metode {
	
	//metode pisemo ili ispod ili iznad glavne metode,nikako u telo
	public static void hello() {
		System.out.println("Hello! ");
		System.out.println("...");
	}
	
	//vrednosti parametara def tek kada se metoda pozove
	public static void saberi1(float a, float b) {
		float suma = a+b;
		System.out.println(suma);
	}
	//metoda koja vraca vrednost u tipu float
	//kada pisemo return ne vidimo u konzoli sta je radjeno
	public static float saberi2(float a, float b) {
		float suma = a+b;
		return suma;
	}
	
	public static void main(String[] args) {
		
		//mozemo da vrsimo prenos vrednosti u metodi 
		//void ne vraca vrednost sume,kada se ne koristi void vraca promenljivu
		//return vraca vrednost akcije koja se odigrala
		System.out.println(saberi2(5.0f,2.0f));
		hello();
		//moramo da unesemo vrednosti koje zelimo da saberemo ,npr:3,6
		saberi1(3.0f, 6.5f);
	}

}
