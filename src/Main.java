import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		
		//fill the code
		
		
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
			
		// fill the code
		System.out.printf("Total Amount to be paid is %.2f\n",);
		//fill the code
		System.out.printf("The balance amount is %.2f",);
	
	}
	
	
}
