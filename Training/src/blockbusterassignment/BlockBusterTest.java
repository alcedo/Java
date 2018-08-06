package blockbusterassignment;

import java.time.LocalDate;
import java.util.Date;

public class BlockBusterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockBuster centralShop=new BlockBuster();
		centralShop.addShop();
		//centralShop.addShop();
		centralShop.addCustomer("Shubham",LocalDate.of(1996, 01,25),"Mumbai");
		System.out.println(centralShop);
		Shop currShop=centralShop.getShop(100);
		Customer currCustomer=centralShop.getCustomer(1000);
		
		Film film=new Film("DON3",19);
		currShop.addStocks(film, 3);
		currShop.Borrow(film, currCustomer);
		
		System.out.println(currShop);
		System.out.println(currCustomer);
		currShop.Return(film, currCustomer);
		System.out.println(currShop);
		System.out.println(currCustomer);
		
	}

}
