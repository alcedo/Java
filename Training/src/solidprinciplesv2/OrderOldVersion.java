package solidprinciplesv2;

import solidprinciplesv2.PaymentDetails.PaymentMethod;

//TODO : Order class have lot of responsibility so it is violating single responsibility and expose of all variables and we cant make interface with 4 funcitons
//common dependency is on shopping cart
public class OrderOldVersion {

	public void checkout(Cart cart, PaymentDetails paymentDetails, boolean notifyCustomer) {
		//TODO: To divide into three classes
		if (paymentDetails.getPaymentMethod() == PaymentMethod.CREDIT_CARD)
			chargeCard(paymentDetails, cart);

		reserveInventory(cart);

		if (notifyCustomer)
			notifyCustomer(cart);
	}
	
	public void notifyCustomer(Cart cart) {

		String customerEmail = cart.getCustomerEmail();
		// TODO: code to send email using JavaMail API missig right now
	}

	public void reserveInventory(Cart cart) {

		for (OrderItem item : cart.getItems()) {
			InventorySystem inventorySystem = new InventorySystem();
			inventorySystem.reserve(item.getSku(), item.getQuantity());

		}
	}

	public void chargeCard(PaymentDetails paymentDetails, Cart cart) {

		PaymentGateway paymentGateway = new PaymentGateway();

		paymentGateway.setNameOntheCard(paymentDetails.getCardHolderName());
		paymentGateway.setExpiryDate(paymentDetails.getExpiryDate());
		paymentGateway.setCardNumber(paymentDetails.getCardHolderName());
		paymentGateway.setAmountToCharge(cart.getTotalAmount());

		paymentGateway.charge();
	}
}
