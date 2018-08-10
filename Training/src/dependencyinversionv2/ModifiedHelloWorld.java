package dependencyinversionv2;

import java.time.LocalTime;

public class ModifiedHelloWorld {
	private LocalTime time; //this is used for dependency inversion
	public ModifiedHelloWorld(LocalTime time) {
		// TODO Auto-generated constructor stub
		this.time=time;
	}
	public String sayHello(String name) {
		String reply ;
		int hour=time.getHour();
		if (hour < 12)
			reply = new String("Hi "+ name+ " Good Morning");
		else if(hour<16)
			reply = new String("Hi "+ name+ " Good Afternoon");
		else if(hour<21)
			reply = new String("Hi "+ name+ " Good Evening");
		else
			reply = new String("Hi "+ name);
		return reply;
	}
}
