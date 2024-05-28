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
