package banque;

public abstract class Operation {
	
	private String date;
	private double montant;
		
	// Constructor
	public Operation(String date, double montant) {
		super();
		this.date = date;
		this.montant = montant;
	}

	
	// Une methode abstraite
	public abstract String getType();
	
	public String toString() {
		return "Operation [date=" + date + ", montant=" + montant + " Type - " + getType() + "]";
	}	

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}


	/**
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}


	/**
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	
	
	
}
