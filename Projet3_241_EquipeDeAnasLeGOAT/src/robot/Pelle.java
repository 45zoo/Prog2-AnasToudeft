/**
 * Cours 420-241-AH. H2024. Prof: N. Grenon
 * TP 3
 * Auteurs : Anas Toudeft, Jeremy Jay Bentley, Farhat Farhat, Adam Boujendar
 * Derniere modification : 2024-05-27
 */

package robot;

public class Pelle extends Action {
	
	private boolean direction;

	public Pelle(Robot bot, boolean direction) {
		super(bot);
		this.direction = direction;
		description = "Pelle";
	}
	public void go() {
		if (direction) { //on leve la pelle :
			bot.pelle().monte();
		}
		else {  //on baisse la pelle :
			bot.pelle().descend();
		}
	}
}
