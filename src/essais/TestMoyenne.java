package essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne calculmoy = new CalculMoyenne();
		
		calculmoy.ajout(21);
		calculmoy.ajout(124);
		calculmoy.ajout(237);
		
		double result = calculmoy.calcul();
		System.out.println(result);

	}

}
