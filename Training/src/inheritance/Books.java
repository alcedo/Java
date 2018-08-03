package inheritance;

public class Books extends MyProduct {

	

	public Books(String name, int uid, int stock, int price, String desc) {
		super(name, uid, stock, price, desc);
		// TODO Auto-generated constructor stub
	}

	public double discount() {
		// TODO Auto-generated method stub
		return 0.1*price;
	}



}
