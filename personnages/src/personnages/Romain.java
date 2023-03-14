package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		assert force >0 : "la force d’un Romain est toujours positive";
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
		return "Le romain " + nom + " : ";
}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
}
	public static void main(String[] args) {	
		Romain patrick = new Romain("Patrick",4);
		patrick.parler("Feur");
		patrick.recevoirCoup(6);
		Romain minus = new Romain("Minus",6);
}
}
