package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * @category Serialization
 * @author singhals
 * @version 1.0 
 */
public class SerializationDemo 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileOutputStream fout= new FileOutputStream("emp.dat");
		ObjectOutputStream serializer= new ObjectOutputStream(fout);
		
		Employee emp=new Employee(1001,"Shubham",1000);
		
		serializer.writeObject(emp);
		
		serializer.close();
		
		fout.close();
		
		FileInputStream fin=new FileInputStream("emp.dat");
		ObjectInputStream dserializer=new ObjectInputStream(fin);
		
		Object  o=dserializer.getClass();
		
		System.out.println(o.toString());
		
		Employee empl=(Employee) dserializer.readObject();
		System.out.println(empl);
		
		dserializer.close();
		fin.close();
	}
}
