package loggerv3;

public class LoggerTest {

	public static void main(String[] args) {
		/*
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
		*/
		//LOGGER FACTORY (ABSTRACTION)
		System.out.println("FACTORY LOGGER");
		LoggerFactory loggerFactory=LoggerFactory.getInstance(); //HELP IN REMOVING CHANGES OF OBJECT IN WHOLE PROJECT
		Logger logger2=loggerFactory.getLoggerObject("console");
		logger2.log("Hi Shubham");
		logger2.log("Hello", LogLevel.WARNING);
	}

}
