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
import java.util.ArrayList;
import java.util.HashSet;

/**
 * This java Program copies the content of one file into content
 * @author Shubham Singhal
 * @version 1.1
 * 
 */
public class FastCopy {

	public static void main(String[] args) {
		
//		FileInputStream inFile=null;
//		FileOutputStream outFile=null;
		BufferedReader inbuffer=null;
		BufferedWriter outbuffer=null;
		
		FileReader inFile=null;
		FileWriter outFile=null;
		List<String> line=new ArrayList<String>();
		Set<String> line2=new HashSet<String>();
		long startTime =System.currentTimeMillis();
		try 
		{
				inFile=new FileReader("C:/Users/singhals/Desktop/Source/eclipse.zip");
				outFile=new FileWriter("C:/Users/singhals/Desktop/Source/shubham.zip");
				inbuffer=new BufferedReader(inFile);
				outbuffer=new BufferedWriter(outFile);
				//int ch=0;
				String l="";
				while(true)
				{
					l=inbuffer.readLine();
					if(l==null) break;
					if(!line2.contains(l))
					{
						line2.add(l);
						outbuffer.write(l);
						outbuffer.newLine();
					}
					
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
				inbuffer.close();
				inFile.close();
				System.out.println("Read successfullly");
			}
			catch (Exception e) 
			{
				// TODO: handle exception
			}
			try 
			{
				outbuffer.close();
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
