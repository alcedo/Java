package sportScheduler;

import java.util.Arrays;

public class Player  {
	String Name;
	Team[] t;
	Game[] g;
	public Player(String name) {
		super();
		Name = name;
	}
	@Override
	public String toString() {
		return "Player [Name=" + Name + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Team[] getT() {
		return t;
	}
	public void setT(Team[] t) {
		this.t = t;
	}
	public Game[] getG() {
		return g;
	}
	public void setG(Game[] g) {
		this.g = g;
	}
	
}
