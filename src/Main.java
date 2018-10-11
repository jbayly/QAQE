import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
public class Main {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException, ParseException, InvalidPaymentException {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Invoice Details:");
		System.out.format("%-5s %-15s %-20s %-15s %-10s %s\n","ID","Customer Name","Payment Attempts","Total Amount","Balance","Status");
		
		InvoiceBO invoiceBO = new InvoiceBO();
		List<Invoice> allinvoice = invoiceBO.getAllInvoice();

		for(Invoice inv : allinvoice){
			System.out.format("%-5s %-15s %-20s %-15s %-10s %s\n",inv.getId().toString(),inv.getCustomerName(),inv.getPaymentAttempts().toString(),inv.getTotalAmount().toString(),inv.getBalance().toString(),inv.getStatus());
		}
		
		
		System.out.println("Enter the invoice id to pay :");
		Integer id = Integer.parseInt(buff.readLine());
		System.out.println("Enter the name :");
		String name = buff.readLine();
		
		System.out.println("Enter the amount :");
		Double amount = Double.parseDouble(buff.readLine());
			
		System.out.println("Enter the card number :");
		String cardNo = buff.readLine();
		
		System.out.println("Enter the cvv :");
		String cvv = (buff.readLine());
			
		System.out.println("Enter the card name :");
		String cardName = buff.readLine();
		Double totalamount=0.0;
		try{
			CreditCardPayment creditCardPayment = new CreditCardPayment(name,amount,cardNo,cvv,cardName);
			 totalamount = creditCardPayment.calculateTotalAmount();
		}
		catch (InvalidPaymentException ex){
			System.out.println("InvalidPaymentException: "+ex.getMessage());
			System.exit(0);
		}
		System.out.printf("Total Amount to be paid is %.2f\n",totalamount);
		invoiceBO.updateInvoiceDetails(id,amount);
		Invoice myinvoice = invoiceBO.getinvoice(id);
		Double bal = myinvoice.getBalance();
		System.out.printf("The balance amount is %.2f",bal);
	
	}
	
	
}
