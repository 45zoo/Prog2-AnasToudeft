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
