
public abstract class Payment {

	protected String accountHolderName;
	protected Double amount;
	
	public Payment() {
	
	}

	public Payment(String accountHolderName, Double amount) {
		super();
		this.accountHolderName = accountHolderName;
		this.amount = amount;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	// fill the code
}
