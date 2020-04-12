package itbootcamp.vezbe;

public class Glavniprogram1 {

	public static void main(String[] args) {

		Sportista s1 = new Sportista("Vlade Divac","kosarka","Zvezda",12);

		s1.getImeIPrezime();
		System.out.println(s1.getImeIPrezime());
		
		s1.getSport();
		System.out.println(s1.getSport());
		
		System.out.println(s1.getBroj());
		s1.setBroj(23);
		System.out.println(s1.getBroj());
	}

}
