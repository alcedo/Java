package solidprinciplesv2;

public class OnlineOrder extends Order {

	private InventoryService inventoryService;
	private NotificationService notificationService;
	private PaymentService paymentService;
	private PaymentDetails paymentDetails;

	public OnlineOrder(Cart cart, PaymentDetails paymentDetails) {
		super(cart);
		this.inventoryService = new InventoryServiceImpl(); // this is tight coupling
		this.notificationService = new NotificationServiceImpl();// this is tight coupling
		this.paymentService = new PaymentServiceImpl();// this is tight coupling so we have to do inverse dependencies
		this.paymentDetails = paymentDetails;
		//to make losely coupled is we have to remove the new keyword
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		paymentService.chargeCard(paymentDetails, cart);
		inventoryService.reserveInventory(cart);
		notificationService.notifyCustomer(cart);
	}

}
