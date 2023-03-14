package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement equipement[] = new Equipement[2];
	private int nbEquipement = 0;
	
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
	public void sEquiper(Equipement objet) {
		switch (nbEquipement){
		case 2 :
			System.out.println("Le soldat "+ nom 
			+" est déjà bien protégé !");
			break;
		case 1:
			if (equipement[0]==objet){
				System.out.println("Le soldat "+ nom 
				+" possède déjà un "+ objet +".");
			}
			else {
				System.out.println("Le soldat "+ nom 
				+" s’équipe avec un "+ objet +".");
				nbEquipement++;
			}	
			break;
		default :
			System.out.println("Le soldat "+ nom 
			+" s’équipe avec un "+ objet +".");
			equipement[nbEquipement] = objet;
			nbEquipement++;
		}
		}
	public static void main(String[] args) {	
		Romain patrick = new Romain("Patrick",4);
		patrick.parler("Feur");
		patrick.recevoirCoup(6);
		Romain minus = new Romain("Minus",6);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		patrick.sEquiper(Equipement.CASQUE);
		patrick.sEquiper(Equipement.CASQUE);
		patrick.sEquiper(Equipement.BOUCLIER);
		patrick.sEquiper(Equipement.BOUCLIER);
}
}
