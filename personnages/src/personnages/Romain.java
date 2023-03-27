package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;
	private String texte;
	
	public Romain(String nom, int force) {
		assert force >0 : "la force d’un Romain est toujours positive";
		this.nom = nom;
		this.force = force;
}
	public String getNom() {
		return nom;
}
	public int getForce() {
		return force;
}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
}
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		if (force == 0) {
			parler("Aïe");
		}
			else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			}
			// post condition la force a diminuée
			assert force < oldForce;
			return equipementEjecte;
}
	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
		for (int i = 0; i < nbEquipement;i++) {
			if ((equipement[i] != null && equipement[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
			}
			else {
				System.out.println("Equipement casque");
				resistanceEquipement += 5;
			}
		}
		texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}
		private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipement[i] != null) {
				equipementEjecte[nbEquipementEjecte] =
				equipement[i];
				nbEquipementEjecte++;
				equipement[i] = null;
			}
		}
		return equipementEjecte;
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
