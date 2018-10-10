
public class Invoice {

	private Integer id;
	private String customerName;
	private Integer paymentAttempts;
	private Double totalAmount;
	private Double balance;
	private String status;
	
	public Invoice() {
		
	}

	public Invoice(Integer id, String customerName, Integer paymentAttempts,
			Double totalAmount, Double balance, String status) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.paymentAttempts = paymentAttempts;
		this.totalAmount = totalAmount;
		this.balance = balance;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getPaymentAttempts() {
		return paymentAttempts;
	}

	public void setPaymentAttempts(Integer paymentAttempts) {
		this.paymentAttempts = paymentAttempts;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-5s %-15s %-20s %-15s %-10s %s\n",id, customerName, paymentAttempts, totalAmount, balance, status);
	}
}
