package loggerv2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Date;

/**
 * @version 2.0
 * @author singhals
 *
 */
public class FileLogger extends Logger {

	@Override
	public void log(String msg,LogLevel level)  {
		
	
		Path path = Paths.get("C:/Users/singhals/Desktop/Source/"+LocalDate.now().toString()+".log");
		String logs = new String("["+level+"] ["+new Date()+"] "+msg+"\n");

		try {
			Files.write(path, logs.getBytes(),StandardOpenOption.APPEND);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
}
