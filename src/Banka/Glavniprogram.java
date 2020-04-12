package Banka;

public class Glavniprogram {

	public static void main(String[] args) {
		Racun mojRacun = new Racun();
		mojRacun.uplati(1000);
		System.out.println(mojRacun.dohvatiStanje());
		mojRacun.podigni(100);
		System.out.println(mojRacun.dohvatiStanje());
	}

}
