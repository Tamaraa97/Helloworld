package Pozoriste;

public class GlavniProg {

	public static void main(String[] args) {
		/*Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i naziv koji mogu da se dohvate. 
		 * Moze da se sastavi tekstualni opis u obliku naziv[id].
		 * Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem u kojem je zaposlen. 
		 * Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].
		 * Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].
		 * Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].
		 * Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u realizaciji predstave. 
		 * Zaposleni za realizaciju predstave mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
		 * Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se predstava odrzava razdvojene zarezom,
		 *  a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
		 */
		
		Pozoriste poz1 = new Pozoriste(1, "Bosko buha");
		Pozoriste poz2 = new Pozoriste(2, "Atelje 212");
		
		Zaposleni z1 = new Zaposleni("Nikola Jovic",poz1);
		Zaposleni z2 = new Zaposleni("Pera Peric",poz2);
		Zaposleni z3 = new Zaposleni("Jelena Jovanovic",poz2);
		
		Glumac g1 = new Glumac("Milos Jankovic",poz1,"uloga1");
		Glumac g2 = new Glumac("Milica Radovanovic",poz2,"uloga2");
		
		Reditelj r1 = new Reditelj("Jelena Dadic",poz1,"Jeca");
		Reditelj r2 = new Reditelj("Marko Milosevic",poz2,"Mare");
		
		Predstava p1 = new Predstava("Ko to tamo peva",poz1);
		Predstava p2 = new Predstava("Krcko orascic",poz2);
		
		p2.dodajZaposlenog(z1);
		p2.ukloniZaposlenog(z3);
		p2.dodajZaposlenog(z3);
		p2.dodajZaposlenog(z1);
		System.out.println("Broj zaposlenih koji ucestvuju u "+ p2.getNazivPredstave()+"predstavi je "+  p2.brZaposlenih());
		
		
		p1.dodajZaposlenog(z2);
		p1.dodajZaposlenog(z3);
		p1.dodajZaposlenog(z1);
		p1.ukloniZaposlenog(z1);
		p1.dodajZaposlenog(z1);
		System.out.println("Broj zaposlenih koji ucestvuju u "+ p1.getNazivPredstave()+"predstavi je "+  p1.brZaposlenih());
	}

}
