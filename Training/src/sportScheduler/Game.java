package sportScheduler;

public class Game  {
	
	Team t1;
	Team t2;
	String name;
	int startTime;
	int EndTime;
	int date;
	public Game(Team t1, Team t2, String name, int startTime, int endTime, int date) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.name = name;
		this.startTime = startTime;
		EndTime = endTime;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Game [t1=" + t1 + ", t2=" + t2 + ", name=" + name + ", startTime=" + startTime + ", EndTime=" + EndTime
				+ ", date=" + date + "]";
	}
	public Team getT1() {
		return t1;
	}
	public void setT1(Team t1) {
		this.t1 = t1;
	}
	public Team getT2() {
		return t2;
	}
	public void setT2(Team t2) {
		this.t2 = t2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return EndTime;
	}
	public void setEndTime(int endTime) {
		EndTime = endTime;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
}
