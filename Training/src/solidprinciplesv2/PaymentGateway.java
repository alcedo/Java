package solidprinciplesv2;

/**
 * @version 1.0
 * @author singhals
 *
 */
public class PaymentGateway {

	private String cardNumber;
	private String nameOntheCard;
	private String expiryDate;
	private double amountToCharge;

	public void charge() {
		// TODO: ADD IMPLEMENTAION

	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getNameOntheCard() {
		return nameOntheCard;
	}

	public void setNameOntheCard(String nameOntheCard) {
		this.nameOntheCard = nameOntheCard;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public double getAmountToCharge() {
		return amountToCharge;
	}

	public void setAmountToCharge(double amountToCharge) {
		this.amountToCharge = amountToCharge;
	}

}
