package entites;

public class CompteBancaire {

	private String numeroCompte;
	private double solde;
	private Personne proprietaire;
	
	/** Constructor
	 * @param numeroCompte
	 * @param solde
	 * @param preprietaire
	 */
	public CompteBancaire(String numeroCompte, double solde, Personne proprietaire) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.proprietaire = proprietaire;
	}
	
	public void crediterMontant(double credit) {
		System.out.println("Crediter de " + credit + " euro" + "\u20ac");
		this.solde += credit;
	}
	
	public void debiterMontant(double debit) {
		System.out.println("Debiter de " + debit + " euro");
		this.solde -= debit;
	}

	
	public String toString() {
		return "CompteBancaire [numeroCompte=" + numeroCompte + ", solde=" + solde + ", proprietaire=" + proprietaire
				+ "]";
	}

	/**
	 * @return the numeroCompte
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * @param numeroCompte the numeroCompte to set
	 */
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * @return the proprietaire
	 */
	public Personne getProprietaire() {
		return proprietaire;
	}

	/**
	 * @param proprietaire the proprietaire to set
	 */
	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}

	
	
}
