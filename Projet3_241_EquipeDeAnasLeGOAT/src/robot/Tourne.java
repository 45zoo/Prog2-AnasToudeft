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
