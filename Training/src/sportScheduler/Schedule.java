package sportScheduler;

import java.util.Arrays;

public class Schedule  {
	
	int date;
	
	Game g[];
	
	public Schedule(int date, Game[] g) {
		super();
		this.date = date;
		this.g = g;
	}

	@Override
	public String toString() {
		return "Schedule [date=" + date + ", g=" + Arrays.toString(g) + "]";
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public Game[] getG() {
		return g;
	}

	public void setG(Game[] g) {
		this.g = g;
	}
    
}
