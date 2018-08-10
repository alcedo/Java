package loggerv3;

import java.util.Date;

/**
 * @version 2.0
 * @author singhals
 *
 */
public class ConsoleLogger extends Logger {

	
	public void log(String msg,LogLevel level) {
		
		System.out.println("["+level+"] ["+new Date()+"] "+msg);
	}
}
