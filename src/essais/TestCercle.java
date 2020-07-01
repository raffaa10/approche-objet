package essais;

import entites.Cercle;
import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		
		Cercle cerc1 = new Cercle(4.5);
		System.out.println(cerc1.getPerimetre());
		System.out.println(cerc1.getSurface());
		
		Cercle cerc2 = new Cercle(7.5);
		System.out.println(cerc2.getPerimetre());
		System.out.println(cerc2.getSurface());
		
		
		// CercleFactory - Appel de la methode static
		System.out.println(CercleFactory.cercFact(5.0));
		
		double c2 = CercleFactory.cercFact(2.5);
		System.out.println(c2);
		

	}

}
