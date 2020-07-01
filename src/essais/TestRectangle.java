package essais;

import entites.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(2.0, 2.5);
		System.out.println("Perimetre de premier rectangle egal a " + rect1.perimetre());
		System.out.println("Surface de premier rectangle egal a " + rect1.surface());
		 
		
		Rectangle rect2 = new Rectangle(3.2, 4.5);
		System.out.println("Perimetre de deuxieme rectangle egal a " + rect2.perimetre());
		System.out.println("Surface de deuxieme rectangle egal a " + rect2.surface());
		

	}

}
