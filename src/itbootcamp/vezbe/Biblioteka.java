package itbootcamp.vezbe;

public class Biblioteka {

	public static void main(String[] args) {
		Autor a = new Autor("Ivo","Andric",1892);
		System.out.println(a);
		
		Knjige k = new Knjige("Na drini cuprija",a,450,1983);
		System.out.println(k);
		k.getAutor().getGodiste1();

	}

}
