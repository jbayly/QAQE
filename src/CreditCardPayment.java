
public class CreditCardPayment   // fill the code
{

	private String cardNumber;
	private String cvv;
	private String cardName;
	
	public CreditCardPayment() {
		
	}

	public CreditCardPayment(String name, Double amount, String cardNumber, String cvv, String cardName) {
		super(name, amount);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.cardName = cardName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	@Override
	public Double calculateTotalAmount() 
	//fill the code
	
	}
	
	
}
