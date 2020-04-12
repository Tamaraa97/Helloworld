package Pozoriste;

public class Glumac extends Zaposleni {
/*Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].*/
	
	private String nazivUloge;
	
	public Glumac(String imeIPrezime,Pozoriste pozoriste,String nazivUloge) {
		super(imeIPrezime,pozoriste);
		this.nazivUloge = nazivUloge;
	}
	
	public String toString() {
		return nazivUloge+"["+ super.getPozoriste().getNaziv()+"]";
	}
}
