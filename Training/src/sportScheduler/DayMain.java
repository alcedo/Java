package sportScheduler;

public class DayMain {
	static Schedule []s=new Schedule[1];
	static int counter=0;
	static void playerwise(String name)
	{
		for(Schedule a:s)
		{
			for(Game g:a.getG())
			{
				for(Player p:g.getT1().getP())
				{
					if(p.getName().equals(name))
						System.out.println(a);
				}
				for(Player p:g.getT2().getP())
				{
					if(p.getName().equals(name))
						System.out.println(a);
				}
			}
		}
	}
	static void gamewise(String name)
	{
		for(Schedule a:s)
		{
			for(Game g:a.getG())
			{
				if(g.getName().equals(name))
					System.out.println(a);
			}
		}
	}
	public static void main(String[] args) {
		Player a[]=new Player[3];
		Player b[]=new Player[3];
		
		for(int i=0;i<=2;i++)
		{
			a[i]=new Player("abcd"+i);
			b[i]=new Player("Shubham"+i);
		}
		
		Team t1=new Team("FF", a);
		Team t2=new Team("GG",b);
		
		Game []g =new Game [1];//Single day has n game
		g[0]=new Game(t1, t2, "Football",1,2,22);
		
		s[counter]=new Schedule(22, g);
		counter++;
		System.out.println(s[0]);
		DayMain.playerwise("Shubham1");
		
		
	}

}
