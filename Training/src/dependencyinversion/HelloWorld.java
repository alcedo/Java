package dependencyinversion;

import java.time.LocalTime;
import java.util.Date;

public class HelloWorld {

	public String sayHello(String name) {
		String reply ;
		LocalTime time = LocalTime.now();
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
