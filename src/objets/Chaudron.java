package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;

	public void remplirChaudron(int quantite, int forcePotion) {

	}

	public boolean resterPotion() {
		if (quantitePotion <= 0) {
			return false ;
		}
		return true;

	}

	public void prendreLouche() {
		
	}
}
