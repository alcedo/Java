package loggerv2;

import java.util.Date;

/**
 * @version 2.0
 * @author singhals
 *
 */
public class Logger {

	public void log(String msg) {
		log(msg, LogLevel.INFO);
	}
	public void log(String msg,LogLevel level)
	{
		System.out.println("["+level+"] ["+new Date()+"] "+msg);
	}
}
