package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix",15);
		Romain minus = new Romain("Minus",6);
		Druide panoramix = new Druide("Panoramix",5,10);
		/*
		 * asterix.parler("Bonjour a tous");
		 * minus.parler("UN GAU... UN GAUGAU...");
		 * asterix.frapper(minus);
		 * asterix.frapper(minus); 
		 * asterix.frapper(minus);
		 */
		panoramix.parler("« Bonjour, je suis le druide Panoramix "
				+ "et ma potion peut aller d'une force 5 à 10");
		panoramix.parler("« Je vais aller préparer une petite potion..");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("« Par Bélénos, ce n'est pas juste !");
		asterix.boirePotion(6);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
	}

}
