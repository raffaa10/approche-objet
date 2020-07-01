package banque;

public class Debit extends Operation {

	/** Constructor
	 * @param date
	 * @param montant
	 */
	public Debit(String date, double montant) {
		super(date, montant);
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Debit";
	}

	
	
	

}
