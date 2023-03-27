package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	private int effetPotion = 1;
	private int forcePotion = 1;
	
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
}
	public String getNom() {
		return nom;
}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
			}
	}
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		if (forcePotion==3) {
			System.out.println(" Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée");
		}
	}
	@Override
	public String toString() {	
	return "Gaulois [nom=" + nom + ", force=" + force
	+ ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain patrick = new Romain("Patrick",4);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.frapper(patrick);
		asterix.boirePotion(3);
	}
}