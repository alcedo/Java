package inheritance;

import java.awt.List;

public class Shopping {

	public static void main(String[] args) {
		MyProduct [] products=new MyProduct[5];
		List l1=new List();
		try {
		products[0]= new Books("Book1",1,2,100,"Something");
		System.out.println("Price"+products[0].order(1)+ " "+products[0]);
		products[1]= new Books("Book2",2,3,200,"Something");
		System.out.println("Price"+products[1].order(2)+ " "+products[1]);
		products[2]=new Toys("Toy1", 3, 10, 300, "Some Toy",4);
		System.out.println("Price"+products[3].order(2)+ " "+products[2]);
		products[3]=new Toys("Toy2", 3, 10, 300, "Some Toy",2);
	    System.out.println("Price"+products[4].order(2)+ " "+products[3]);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
