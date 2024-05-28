/**
 * Fichier:	Mini.java
 * Cours:   420-238/241-AH
 * Par:     ngrenon
 * Travail: Projet3_241
 * Date:    7 mai 2024
 */

package robot;

public class Mini {
	public static void main(String[] args) {
		Robot robot = Robot.connect();
		robot.ecran().ecrire("Peser OK");
		robot.diodes().couleur(Diodes.ORANGE);
		robot.son().bip();
		robot.boutons().attend();
		robot.ecran().efface();
		robot.pilote().avance(10.0, 10.0);
		robot.pilote().tourne(180.0);
		robot.pilote().avance(5.0, 15.0);
		robot.pelle().descend();
		robot.pelle().monte();
		robot.ecran().ecrire("Voila!");
		robot.boutons().attend();
	}
}
