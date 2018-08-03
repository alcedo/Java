import java.util.List;
import java.util.Set;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * This java Program copies the content of one file into content using nio library
 * @author Shubham Singhal
 * @version 1.2
 * 
 */
public class SuperFastCopy 
{

	public static void main(String[] args) 
	{
		
		FileInputStream inFile=null;
		FileOutputStream outFile=null;
		FileChannel inChannel=null;
		FileChannel outChannel=null;
		
		ByteBuffer buffer=null;
		long startTime =System.currentTimeMillis();
		
		try 
		{
				inFile=new FileInputStream("C:/Users/singhals/Desktop/Source/eclipse.zip");
				outFile=new FileOutputStream("C:/Users/singhals/Desktop/Source/abc.zip");
				inChannel=inFile.getChannel();
				outChannel=outFile.getChannel();
				
				buffer =ByteBuffer.allocate(1024*16);
				
				while(true)
				{
					int count=inChannel.read(buffer);
					if(count==-1) break;
					buffer.flip();
					outChannel.write(buffer);
					buffer.clear();
				}
				long endTime =System.currentTimeMillis();
				System.out.println("File copied successfully in "+ (endTime-startTime));
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
				inChannel.close();
				inFile.close();
				
			}
			catch (Exception e) 
			{
				// TODO: handle exception
			}
			try 
			{
				outChannel.close();
				outFile.close();
			}
			catch (Exception e) 
			{
				// TODO: handle exception
			}
		}
	}
}
