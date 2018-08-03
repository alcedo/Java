package inheritance;

public abstract class MyProduct {
	String Name;
	int uid;
	int stock;
	int price;
	String desc;

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public MyProduct(String name, int uid, int stock, int price, String desc) {
		super();
		Name = name;
		this.uid = uid;
		this.stock = stock;
		this.price = price;
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "MyProduct [Name=" + Name + ", uid=" + uid + ", stock=" + stock + ", price=" + price + ", desc=" + desc
				+ "]";
	}	
	//public abstract double discount() throws Exception;
	public boolean check_Order(int qty)
	{
			if(stock>qty)
			{
				return true;
			}
			else
			{
				return false;
			}
	}
	public double order(int qty) throws Exception
	{
		if(check_Order(qty))
		{
			stock-=qty;
			return qty*(price-discount());
		}
		else
		{
			Exception e= new Exception("Quantity is not available");
			throw e;
		}
	}

	public abstract double discount() throws Exception;
}
