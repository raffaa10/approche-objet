package banque;

public class CompteTaux extends Compte {
	
	private double tauxRemuneration;
	
	public CompteTaux(int numeroCompte, int soldeCompte, double tauxRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
		
	}


	public String toString() {
		String data = super.toString();
		return data + " taux = " + tauxRemuneration;
	}
	/**
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	

}
