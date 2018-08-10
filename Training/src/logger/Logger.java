package logger;

import java.util.Date;

/**
 * @version 1.0
 * @author singhals
 *
 */
public class Logger {

	public void log(String msg) {
		this.log(msg, LogLevel.INFO);
	}
	public void log(String msg,LogLevel level) {
		
		System.out.println("["+level+"] ["+new Date()+"] "+msg);
	}
}
