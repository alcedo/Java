package EncodingDecoding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Base64;


public class EncodeDecode {

	private BufferedReader inbuffer;
	private BufferedWriter outbuffer;

	private FileReader inFile;
	private FileWriter outFile;
	
	String line;

	public void initialiseNull()
	{
		inbuffer=null;
		outbuffer=null;

		inFile=null;
		outFile=null;
		line=new String("");

	}
	
	public void creationObjects(String sourceLocation,String destinationLocation) throws IOException
	{
		inFile=new FileReader("C:/Users/singhals/Desktop/Source/"+sourceLocation);
		outFile=new FileWriter("C:/Users/singhals/Desktop/Source/"+destinationLocation);
		inbuffer=new BufferedReader(inFile);
		outbuffer=new BufferedWriter(outFile);

	}
	public void deallocationObjects() throws IOException
	{
		inbuffer.close();
		outbuffer.close();
		inFile.close();
		outFile.close();

	}
	public static String base64Encode(String token) {
		byte[] encodedBytes =Base64.getEncoder().encode(token.getBytes());
		return new String(encodedBytes);
	}


	public static String base64Decode(String token) {
		byte[] decodedBytes = Base64.getDecoder().decode(token);
		return new String(decodedBytes);
	}


	public void fileEncoding(String sourceLocation,String destinationLocation) throws IOException {
		
		this.initialiseNull();
		this.creationObjects(sourceLocation, destinationLocation);
		while(true)
		{
			line=inbuffer.readLine();
			if(line==null) break;
			line=base64Encode(line+"\n");
			outbuffer.write(line);		
			outbuffer.newLine();
		}
		this.deallocationObjects();
	}

	public void fileDecoding(String sourceLocation,String destinationLocation) throws IOException{
		this.initialiseNull();
		this.creationObjects(sourceLocation, destinationLocation);
		while(true)
		{
			line=inbuffer.readLine();
			if(line==null) break;
			line=base64Decode(line);
			outbuffer.write(line);			
		}			
		this.deallocationObjects();
	}


	
}
