/**
 * Cours 420-241-AH. H2024. Prof: N. Grenon
 * TP 3
 * Auteurs : Anas Toudeft, Jeremy Jay Bentley, Farhat Farhat, Adam Boujendar
 * Derniere modification : 2024-05-27
 */

package robot;

import lejos.utility.Delay;

public class Pause extends Action {
	
	private int duree;

	public Pause(Robot bot, int duree) {
		super(bot);
		this.duree = duree;
		description = "Pause";
	}

	@Override
	public void go() {
		//on fait une pause de duree secondes:
		Delay.msDelay(duree * 1000);	
	}
}
