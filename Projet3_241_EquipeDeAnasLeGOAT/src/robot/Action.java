/**
 * Cours 420-241-AH. H2024. Prof: N. Grenon
 * TP 3
 * Auteurs : Anas Toudeft, Jeremy Jay Bentley, Farhat Farhat, Adam Boujendar
 * Derniere modification : 2024-05-27
 */


package robot;

public abstract class Action {
	
	protected Robot bot;
	protected String description;
	
	
	public Action(Robot bot) {
		this.bot = bot;
	}


	@Override
	public String toString() {
		return description;
	}
	public abstract void go();
	

}
