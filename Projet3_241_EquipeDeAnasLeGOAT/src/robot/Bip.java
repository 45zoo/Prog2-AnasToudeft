/**
 * Cours 420-241-AH. H2024. Prof: N. Grenon
 * TP 3
 * Auteurs : Anas Toudeft, Jeremy Jay Bentley, Farhat Farhat, Adam Boujendar
 * Derniere modification : 2024-05-27
 */

package robot;

public class Bip extends Action {
	
	private int nombre;
	
	
	
	public Bip(Robot bot, int nombre) {
		super(bot);
		this.nombre = nombre;
		description = "Bip";
		// TODO Auto-generated constructor stub
	}

	public void go() {
		// on emet 1 bip (par defaut):
		bot.son().bip();
	}
}