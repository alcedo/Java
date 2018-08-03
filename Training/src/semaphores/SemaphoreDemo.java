package semaphores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

class Connection
{
	static int count=0;
	public Connection() 
	{
		// TODO Auto-generated constructor stub
		count++;
	}
}
class ConnectionPool
{
	
	Semaphore semaphore=new Semaphore(5);//5 resources can be allocated simultaneously
	Map<Connection,Integer> mapcon;
	public ConnectionPool() {
		// TODO Auto-generated constructor stub
		mapcon=new HashMap<Connection,Integer>();
	}
	public  Connection getConnection() throws InterruptedException
	{
		semaphore.acquire();
		
		Connection c=null;
		if(mapcon.size()<5)
		{
			 c=new Connection();
			mapcon.put(c,1);
			
		}
		else
		{
			for (Connection cc : mapcon.keySet())
			{
				if(mapcon.get(cc)==0)
				{
					c=cc;
					mapcon.put(c, 1);
				}
			}
		
				
			}
		return c;
		}
	

	
	public void closeConnection(Connection c)
	{
		semaphore.release();
		mapcon.put(c, 0);
	}
}
public class SemaphoreDemo 
{
	
	public static void main(String[] args) 
	{
		
		ConnectionPool cPool=new ConnectionPool();
		Runnable r=() ->
		{
			try 
			{
				Connection c=cPool.getConnection();
				
				System.out.println(" "+c);
				Thread.sleep(5000);
				cPool.closeConnection(c);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		};
		for(int i=0;i<10;i++)
		{
			new Thread(r).start();
		}
	}
}
