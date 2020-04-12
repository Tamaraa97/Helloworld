package Pozoriste;

import java.util.ArrayList;
import java.util.List;



public class Predstava {
	/*Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u realizaciji predstave. 
	Zaposleni za realizaciju predstave mogu da se dodaju i izbace. 
	Moze da se dohvati broj zaposlenih na predstavi.
	Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se predstava odrzava razdvojene zarezom, 
	a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
	*/
	
	private String nazivPredstave;
	private Pozoriste pozoriste;
	private List<Zaposleni> zaposleni;
	
	public Predstava(String nazivPredstave,Pozoriste pozoriste) {
		this.nazivPredstave = nazivPredstave;
		this.pozoriste = pozoriste;
		this.zaposleni = new ArrayList<Zaposleni>();
	}
	
	public boolean dodajZaposlenog(Zaposleni z) {
		int br = 0;
		if(zaposleni.size() == 0) {
			zaposleni.add(z);
			System.out.println("Zaposleni"+ z.getImeIPrezime()+"je deo predstave");
			return true;
		}
		for(int i=0; i<zaposleni.size(); i++) {
			if(zaposleni.get(i)!=z) {
			br++;
			if(br == zaposleni.size()) {
				zaposleni.add(z);
				System.out.println("Zaposleni"+ z.getImeIPrezime()+"je deo predstave");
				return true;
			}		
		}
		}
		System.out.println("Nije moguce dodati zaposlenog"+z.getImeIPrezime());
		return false;
		}
	
	public boolean ukloniZaposlenog(Zaposleni z) {
	if(zaposleni.size() == 0) {
		System.out.println("Zaposleni nije deo predstave" +z.getImeIPrezime());
		return false;
	}
	for(int i =0; i < zaposleni.size();) {
		if(zaposleni.get(i)== z) 
			zaposleni.remove(i);
			System.out.println("Zaposleni je uklonjen iz predstave"+z.getImeIPrezime());
			return true;
		}
		System.out.println("Zaposleni nije deo predstave"+z.getImeIPrezime());
		return false;
	}
		public int brZaposlenih() {
		 return zaposleni.size();
	}

		public String getNazivPredstave() {
			return nazivPredstave;
		}
		
		
		public String toString() {
			String predstava = nazivPredstave+","+ pozoriste.getNaziv();
			for (int i = 0; i < zaposleni.size(); i++) {
				predstava = predstava+zaposleni.get(i).getImeIPrezime();
				
				}
			return predstava;
		
		}
		
		
	
	}

