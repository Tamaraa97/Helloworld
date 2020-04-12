package Zadatak1;

public class MountainBike extends Bicikli{

/*MountainBike je bicikli koji dodatno ima podesavanje visine sedista
 * Visina sedista moze da se podesi na neku vrednost I da se dohvati
 * Napisati metodu koja vraca String
 * Bickli ima  menjac
 * brzina bicikla je brzina 
 * visina sedišta je visinaSedista.
 * */
	
	private int visinaSedista;

		public MountainBike(String pedale,int menjac, int brzina, int visinaSedista) {
				super(pedale,menjac, brzina);
					this.visinaSedista = visinaSedista;
			}

		public int getVisinaSedista() {
			return visinaSedista;
		}

		public void setVisinaSedista(int visinaSedista) {
			this.visinaSedista = visinaSedista;
		}
	
		
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("Bicikl ima ").append(getMenjac()).append("\n").append("Brzina bicikla je ").append(getBrzina()).append("\n").append("Visina sedista je ").append(visinaSedista).toString();
	}

	}

