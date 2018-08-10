package loggerv3;

public class LoggerFactory {

	private static LoggerFactory myself;
	
	private  LoggerFactory() {
		
	}
	public static LoggerFactory getInstance() {
		if(myself==null)
			myself= new LoggerFactory();
		return myself;
	}
	public Logger getLoggerObject(String type) {
		if(type.equals("console"))
			return new ConsoleLogger();
		else if(type.equals("cfile"))
			return new FileLogger();
		throw new UnsupportedOperationException("Invalid logger type "+type);
	}
}
