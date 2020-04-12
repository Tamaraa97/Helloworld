package Zadatak1;

public class Bicikli {

	
		/*Bicikli poseduje pedale(g/s), menjac(g/s) i brzinu. 
		 * menjac ne treba povecavati i smanjiti vec samo koliko bicikl ima brzina
		 * Brzina može da se poveæava ubrzanim okretanjem pedala I smanjuje kocenjem (kreirati dve metode). 
		 * Napisati metodu koja vraca String oblika:  
		 * Bickli ima  menjac.
		 * brzina bicikla je brzina.*/
		
	//napisati da ukoliko bicikl ma
		private String pedale;
		private int menjac;
		private int brzina;
		
		public Bicikli(String pedale,int menjac,int brzina) {
			this.pedale = pedale;
			this.menjac = menjac;
			this.brzina = brzina;
		}
		//za pedale postaviti getere i setere
	public String getPedale() {
			return pedale;
		}

		public void setPedale(String pedale) {
			this.pedale = pedale;
		}
		
		//za menjac takodje treba postaviti getere i setere
		public int getMenjac() {
			return menjac;
		}
		public void setMenjac(int menjac) {
			this.menjac = menjac;
		}
		public int getBrzina() {
			return brzina;
		}
		public void setBrzina(int brzina) {
			this.brzina = brzina;
		}
	
		public void ubrzaj() {
			this.brzina +=1;
		}
		
		public void uspori() {
			this.brzina -= 1;
		}
	
		
		
	public String toString() {
		return menjac + " " + brzina;
	}
		
		
	}


