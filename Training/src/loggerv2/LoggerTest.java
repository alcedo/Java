package loggerv2;

public class LoggerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LOGGER");
		Logger logger=new Logger();
		logger.log("Hi Shubham");
		logger.log("Hello", LogLevel.WARNING);
		
		//CONSOLE LOGGER
		
		System.out.println("CONSOLE LOGGER");
		ConsoleLogger consolelogger=new ConsoleLogger();
		consolelogger.log("Hi Shubham");
		consolelogger.log("Hello", LogLevel.WARNING);
		
		//FILE LOGGER
		System.out.println("FILE LOGGER");
		FileLogger filelogger=new FileLogger();
		filelogger.log("Hi Shubham");
		filelogger.log("Hello", LogLevel.WARNING);
	}

}
