package banque;

public class Compte {
	
	private int numeroCompte;
	private int soldeCompte;

	public Compte(int numeroCompte, int soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
			
	}
	

	@Override
	public String toString() {
		return "Compte - numeroCompte=" + numeroCompte + ", soldeCompte=" + soldeCompte;
	}

	/**
	 * @return the numeroCompte
	 */
	public int getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * @param numeroCompte the numeroCompte to set
	 */
	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/**
	 * @return the soldeCompte
	 */
	public int getSoldeCompte() {
		return soldeCompte;
	}

	/**
	 * @param soldeCompte the soldeCompte to set
	 */
	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	
}

