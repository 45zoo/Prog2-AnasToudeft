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