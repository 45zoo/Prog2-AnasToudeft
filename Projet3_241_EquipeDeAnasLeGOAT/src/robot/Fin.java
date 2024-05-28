/**
 * Cours 420-241-AH. H2024. Prof: N. Grenon
 * TP 3
 * Auteurs : Anas Toudeft, Jeremy Jay Bentley, Farhat Farhat, Adam Boujendar
 * Derniere modification : 2024-05-27
 */

package robot;

public class Fin extends Action{
	
	
	public Fin(Robot bot) {
		super(bot);
		description = "fin";
	}

	public void go() {
		bot.pilote().tourne(360); //le robot tourne sur lui-meme.
		bot.son().bip();  //le robot emet un bip
	}
}
