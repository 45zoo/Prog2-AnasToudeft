/**
 * Cours 420-241-AH. H2024. Prof: N. Grenon
 * TP 3
 * Auteurs : Anas Toudeft, Jeremy Jay Bentley, Farhat Farhat, Adam Boujendar
 * Derniere modification : 2024-05-27
 */

package robot;

public class Tourne extends Action {
	
	private double angle;
	private boolean sens;
	
	
	public Tourne(Robot bot, double angle,boolean sens) {
		super(bot);
		this.angle = angle;
		this.sens = sens;
		description = "Tourne";
		// TODO Auto-generated constructor stub
	}


	public void go() {
		if (sens) { //on tourne a droite
			bot.pilote().tourne(angle);
		}
		else { //on tourne a gauche
			bot.pilote().tourne(-angle);
		}
	}
}
