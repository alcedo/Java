package solidprinciplesv2;

public class PoSCreditOrder extends Order {

	
	private PaymentService paymentService;
	private PaymentDetails paymentDetails;

	public PoSCreditOrder(Cart cart,PaymentDetails paymentDetails) {
		super(cart);
		// TODO Auto-generated constructor stub
		this.paymentDetails=paymentDetails;
		this.paymentService=new PaymentServiceImpl();
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
			paymentService.chargeCard(paymentDetails, cart);
	}

}
