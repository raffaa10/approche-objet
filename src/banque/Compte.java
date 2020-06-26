package banque;

public class Compte {
	
	private int numeroDeCompte;
	private int soldeDeCompte;

	public Compte(int numeroDeCompte, int soldeDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
		this.soldeDeCompte = soldeDeCompte;
	
	}

	/**
	 * @return the numeroDeCompte
	 */
	public int getNumeroDeCompte() {
		return numeroDeCompte;
	}

	/**
	 * @param numeroDeCompte the numeroDeCompte to set
	 */
	public void setNumeroDeCompte(int numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}

	/**
	 * @return the soldeDeCompte
	 */
	public int getSoldeDeCompte() {
		return soldeDeCompte;
	}

	/**
	 * @param soldeDeCompte the soldeDeCompte to set
	 */
	public void setSoldeDeCompte(int soldeDeCompte) {
		this.soldeDeCompte = soldeDeCompte;
	}

	
}

