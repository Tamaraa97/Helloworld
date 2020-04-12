package Ringispil;

public class Voznja {
	/*Voznja poseduje naziv(g,s),cenu(g,s),i ljudi koji sede u njoj
	 * Ljudi mogu da se dodaju ili uklone sa voznje
	 * Voznja ima i zadati br sedista,voznja moze da se naplati*/
	
	private String naziv;
	private int cena;
	private	Covek[] ljudi;
	
	public Voznja(String naziv,int cena,int brSedista) {
		this.naziv = naziv;
		this.cena = cena;
		ljudi = new Covek[brSedista];
	}
	
	public boolean dodajCoveka(Covek c) {
		for(int i = 0; i < ljudi.length;i++) {
			if(ljudi[i]==null) {
					ljudi[i]=c;
					return true;
			}	
		}
		return false;
	}
		
	
	public boolean ukloniCoveka(Covek c) {
		for(int i = 0; i < ljudi.length;i++) {
			//proveravamo da li je na itoj poziciji nas covek
			if(ljudi[i]==c) {
				ljudi[i]=null;
				return true;
			}
		}
		return false;
	}
	
	public void naplata() {
		for(int i=0;i<ljudi.length;i++) {
			if(ljudi[i] != null) {
				//proverava da li covek ima da uplati sa predpostavkom da nema u ifu
				if(ljudi[i].uzmiNovac(cena) == false) {
					//ukoliko je uslov ispunjen nema novca da plati
					ljudi[i] = null;
					//sto znaci da postavljam uslov da taj covek nije na ringispilu
					
				}
			}
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv).append(" ");
		//umesto + koriatimo append
		sb.append(cena);
		sb.append("\n");
		//ovo je oznaka za novi red
		
		for(int i=0;i<ljudi.length;i++) {
			sb.append(ljudi[i]).append("\n");
		}
		return sb.toString();
		}
	}

