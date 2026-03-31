package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;

	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;

	}

	public boolean resterPotion() {
        return quantitePotion > 0;

    }

	public void prendreLouche() {
		if (quantitePotion <= 0) {
			forcePotion = 0;
		} else {
			quantitePotion -= 1;
		}
	}

	public int getForcePotion() {
		return forcePotion;
	}

	public void setForcePotion(int forcePotion) {
		this.forcePotion = forcePotion;
	}
}