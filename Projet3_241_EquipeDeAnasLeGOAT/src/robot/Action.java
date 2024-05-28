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
