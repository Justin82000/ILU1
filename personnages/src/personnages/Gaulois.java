package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
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
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());romain.recevoirCoup(force / 3);
}
public static void main(String[] args) {
		 asterix (nom = "Astérix", force = 8),
		 System.out.println(asterix);
//TODO créer un main permettant de tester la classe Gaulois
}
}
