package sportScheduler;

import java.util.Arrays;

public class Team {
 
	String Name;
	//Game g[];
	Player p[];
	public Team(String name, Player[] p) {
		super();
		Name = name;
		this.p = p;
	}
	@Override
	public String toString() {
		return "Team [Name=" + Name + ", p=" + Arrays.toString(p) + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Player[] getP() {
		return p;
	}
	public void setP(Player[] p) {
		this.p = p;
	}
	
	
}
