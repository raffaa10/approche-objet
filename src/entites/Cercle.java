package entites;

public class Cercle {
	
	private double rayon;
	
	public Cercle(double rayon){
		this.rayon = rayon;		
	}

	/**
	 * @return the perimetre
	 */
	public double getPerimetre() {
		return 2*rayon*3.14;
	}
	
	/**
	 * @return the surface
	 */
	public double getSurface() {
		return rayon*rayon*3.14;
	}

	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
