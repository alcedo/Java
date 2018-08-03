import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This java Program copies the content of one file into content
 * @author Shubham Singhal
 * @version 1.0
 * 
 */
public class Copy {

	public static void main(String[] args) {
		
		FileInputStream inFile=null;
		FileOutputStream outFile=null;
		/*
		FileReader inFile=null;
		FileWriter outFile=null;
		*/
		try 
		{
				inFile=new FileInputStream("C:/Users/singhals/Desktop/Source/eclipse.zip");
				outFile=new FileOutputStream("C:/Users/singhals/Desktop/Source/xyz.zip");
				int ch=0;
				while(true)
				{
					ch=inFile.read();
					if(ch==-1) break;
					outFile.write(ch);
				}
				
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Please check the number of glasses!");
		}
		catch (IOException e) 
		{
			System.out.println("Please Bang head on the floor and try again");
		}
		finally 
		{
			try 
			{
				inFile.close();
				System.out.println("Read successfullly");
			}
			catch (Exception e) 
			{
				// TODO: handle exception
			}
			try 
			{
				outFile.close();
				System.out.println("Write successfullly");
			}
			catch (Exception e) 
			{
				// TODO: handle exception
			}
		}
	}
}
