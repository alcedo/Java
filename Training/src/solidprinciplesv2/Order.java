package solidprinciplesv2;

public abstract class Order {

	//Trying to give one functionality one class
	
	protected Cart cart; // to remove shopping cart dependencies as it was argument of all most all
						// methods

	
	public Order(Cart cart) {
		this.cart = cart;
	}
	
	public abstract void checkOut();
	

}
