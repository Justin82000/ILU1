package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private int nbVillageoisMax;
	private Gaulois villageois[];
	
	public Village(String nom,int nbVillageoisMax) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMax];	
	}	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	public Gaulois trouverHabitant(int num) {
		return villageois[num];
	}
	public void afficherVillageois() {
		System.out.println("Dans village du chef "+chef.getNom()
		+" vivent les legendaires gaulois :");
		for (int i=0;i<nbVillageois;i++) {
			System.out.println("- "+villageois[i].getNom());
		}
	}
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef=chef;
	}
	public static void main(String[] args) {
		
		Village village = new Village("Village des Irreductible", 30);
		/*
		 * village.trouverHabitant(30); Erreur, l'indice 30 ne possede pas d'attribut
		 * Gaulois
		 */
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
		/*
		 * village.trouverHabitant(1); System.out.println(asterix); Affiche le gaulois
		 * present a l'indice 1 ainsi que ces caracteristique !
		 */
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}
