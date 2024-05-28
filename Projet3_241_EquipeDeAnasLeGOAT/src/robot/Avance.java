package robot;

public class Avance extends Action {
	
	private int cm;

	public Avance(Robot bot,int cm) {
		super(bot);
		this.cm = cm;
		description = "Avance";
		// TODO Auto-generated constructor stub
	}
	public void go() {
		//on avance de 10cm a la vitesse de 5:
		bot.pilote().avance(5.0, 10.0);
	}
}
