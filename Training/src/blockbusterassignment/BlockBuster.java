package blockbusterassignment;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BlockBuster {

	private List<Shop> shops;
	private List<Customer> customers;
	private static int shopId=100;
	private static int membershipcardId=1000;
	public BlockBuster() {
		shops=new ArrayList<Shop>();
		customers= new ArrayList<Customer>();
	}
	public void addShop()
	{
		shops.add(new Shop(shopId));
		this.shopId++;
	}
	public void addCustomer(String name, LocalDate dateOfBirth,String Address)
	{
		Customer customer=new Customer(name, dateOfBirth, Address);
		MembershipCard membershipCard=new MembershipCard(this.membershipcardId);
		this.membershipcardId++;
		customer.setIdCard(membershipCard);
		customers.add(customer);
	}

   
	public Shop getShop(int shopId)
	{
		for (Shop s:shops)
		{
			if(s.getShopId()==shopId)
				return s;
		}
		return null; //TODO :Try to remove null
	}
	
	public Customer getCustomer(int membershipId)
	{
		for (Customer c:customers)
		{
			if(c.getIdCard().getCardNumber()==membershipId)
				return c;
		}
		return null; //TODO :Try to remove null
	}

	
	@Override
	public String toString() {
		return "BlockBusterVideos [shops=" + shops + ", customers=" + customers + "]";
	}

}
