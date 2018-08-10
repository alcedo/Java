package EncodingDecoding;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		EncodeDecode file=new EncodeDecode();
		file.fileEncoding("passphrase.txt","Encode.txt");
		file.fileDecoding("Encode.txt","Decode.txt");
	}

}
