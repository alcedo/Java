package logger;

public class LoggerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=new Logger();
		logger.log("Hi Shubham");
		logger.log("Hello", LogLevel.WARNING);
	}

}
