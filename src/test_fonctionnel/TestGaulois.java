package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Gaulois Obelix = new Gaulois("Obelix", 16);
		Romain Minus = new Romain("Minus", 6);

		Asterix.parler("Bonjour Obelix.");
		Obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		Asterix.parler("Oui très bonne idée.");
		System.out.println(" Dans la forêt " + Asterix.getNom() + " et " + Obelix.getNom()
				+ " tombent nez à nez sur le romain " + Minus.getNom());
		for (int i = 0; i < 3; i++) {
			Asterix.frapper(Minus);
			
		}
	}

}
