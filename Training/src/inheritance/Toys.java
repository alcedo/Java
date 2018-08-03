package inheritance;

public class Toys extends MyProduct {

	int age; 
	public Toys(String name, int uid, int stock, int price, String desc,int age) {
		super(name, uid, stock, price, desc);
		this.age=age;		
		// TODO Auto-generated constructor stub
	}




	@Override
	public double discount() throws Exception {
		// TODO Auto-generated method stub
		if(age>=2 && age <4)
		{
			return 0.15*price;
		}
		else if(age>=4 && age <=5)
		{
			return 0.05*price;
		}
		else if(age>5)
		{
			return 0;
		}
		else
		{
			Exception e =new Exception("Invalid Age");
			throw e;
		}
		
	}


}
