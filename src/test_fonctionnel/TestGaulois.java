package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Gaulois Obelix = new Gaulois("Obelix", 16);
		Romain Minus = new Romain("Minus", 6);
		Romain Brutus = new Romain("Brutus", 14);
		Druide Panoramix = new Druide("Panoramix", 2);

		Panoramix.fabriquerPotion(4, 3);
		Panoramix.booster(Obelix);
		Panoramix.booster(Asterix);
		for (int i = 0; i < 3; i++) {
			Asterix.frapper(Brutus);

		}

	}
}
