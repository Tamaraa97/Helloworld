package Picerija;

public class Picerija {

	public static void main(String[] args) {
	
		
		Pica p1 = new Pica(300,"Margarita",30);
		p1.KupiPicu();
		p1.KupiPicu();
		
		Pica p2 = new Pica(250,"Vegetariana",35);
		p2.KupiPicu();
		
		System.out.println(p1.getBrProdatih());
		System.out.println(p2.getBrProdatih());
		System.out.println(Pica.getUkupanBrProdatih());
		System.out.println(p1.getPovrsinaPice());
		System.out.println(p2.getPovrsinaPice());
		System.out.println(p1.ukupnaPovrsina());
		System.out.println(Pica.getUkupnaPovrsina());
		
		

	}

}
