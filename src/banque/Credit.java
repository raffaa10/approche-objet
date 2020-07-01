package banque;

public class Credit extends Operation {

	/** Constructor
	 * @param date
	 * @param montant
	 */
	public Credit(String date, double montant) {
		super(date, montant);
		
	}

	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Credit";
	}

	

	
		
		

}
