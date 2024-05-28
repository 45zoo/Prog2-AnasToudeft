package robot;

import java.util.ArrayList;

import lejos.hardware.Button;

public class Programme {

	public static void main(String[] args) {

		int detectCouleur;
		boolean terminer;

		// Instanciation d'un arraylist d'action.
		ArrayList<Action> actions = new ArrayList<>();

		// Instanciation du robot.
		Robot bot = Robot.connect();

		// Afficher la diode verte:
		bot.diodes().couleur(Diodes.VERT);

		// Emettre un bip:
		bot.son().bip();

		// Afficher un message indiquant d'appuier sur OK:
		bot.ecran().ecrire("Appuyez sur Ok");

		// Attend qu'on appuie sur ok:
		while (!bot.boutons().clicCentre()) {
			bot.boutons().attend();
		}

		terminer = false;
		while (!terminer) {
			bot.pilote().avance(5);
			detectCouleur = bot.optique().couleur();
			
			switch (detectCouleur) {
			case Optique.NOIR :
				//Si on trouve la couleur noire, on ajoute une action Fin et on termine la boucle:
				actions.add(new Fin(bot));
				terminer = true;
				break;
			case Optique.BRUN :
				actions.add(new Pause(bot,3));
				break;
			case Optique.JAUNE :
				actions.add(new Avance(bot,10));
				break;
			case Optique.VERT :
				actions.add(new Tourne(bot,90,true));
				break;
			case Optique.BLEU :
				actions.add(new Tourne(bot,90,false));
				break;
			case Optique.ROUGE :
				actions.add(new Bip(bot,1));
				break;
			case Optique.ROSE :
				actions.add(new Pelle(bot,true));
				break;
			case Optique.ORANGE :
				actions.add(new Pelle(bot,false));
				break;
			}
		}
		
		//Objet Fin est créé avant la sortie de la boucle précédente.
		
		// Emettre un bip:
		bot.son().bip();

		// Changer la couleur de la diode à rouge :
		bot.diodes().couleur(Diodes.ROUGE);
		
		// Emettre un bip:
		bot.son().bip();

		// Afficher un message indiquant d'appuier sur OK:
		bot.ecran().ecrire("Appuyez sur Ok");

		// Attend qu'on appuie sur ok:
		while (!bot.boutons().clicCentre()) {
			bot.boutons().attend();
		}
		
		//On exécute chacune des actions du ArrayList en affichant leurs descriptions :
		for (Action uneAction : actions) {
			uneAction.go();
			bot.ecran().ecrire("Action : "+uneAction);
		}
	}
}