package Zadatak2;

import java.util.ArrayList;
import java.util.List;

public class Meni{
	private List<Jelo> meni;
	private Jelo nazivJela;
	private Sastojak sas;
 
	public Meni(Jelo nazivJela, Sastojak sas) {
		this.nazivJela = nazivJela;
		this.sas = sas;
		this.meni = new ArrayList<Jelo>();
	}
	
	
	public Jelo getNazivJela() {
		return nazivJela;
	}


	public Sastojak getSas() {
		return sas;
	}


	public List<Jelo> getMeni() {
		return meni;
	}
public boolean dodajJelo(Jelo j) {
		int broj=0;
		if(meni.size()==0) {
			meni.add(j);
			System.out.println("Dodato je jelo:"+j.getNazivJela());
			return true;
		}
		for(int i=0;i<meni.size();i++) {
			if(meni.get(i)!=j) {
				broj++;
				if(broj == meni.size()) {
				meni.add(j);
				System.out.println("Dodato je jelo:"+j.getNazivJela());
				return true;
			}	
			}
		}
		
		return false;
	}

/* Meni sadrži listu jela.Može da se ispiše ceo meni u sledeæem formatu: 
	Naziv_jela: nazivNamirnice, nazivNamirnice, … , nazivNamirnice*/
@Override

public String toString() {
    StringBuilder sb = new StringBuilder();
    return sb.append("\n").append(getMeni()).toString();
}

}
	
	

	

