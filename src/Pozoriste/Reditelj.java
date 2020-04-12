package Pozoriste;

public class Reditelj extends Zaposleni {
/*Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. 
 * Tekstualni oblik je nadimak_ime[naziv_pozorista].*/
	
	private String nadimak;
	public Reditelj(String imeIPrezime,Pozoriste pozoriste,String nadimak) {
		super(imeIPrezime,pozoriste );
		this.nadimak = nadimak;
	}
	
	public String toString() {
		return nadimak+"_"+super.getImeIPrezime()+"["+ super.getPozoriste().getNaziv()+"]";
	}
}
