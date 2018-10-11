import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
public class InvoiceBO {

	public List<Invoice> getAllInvoice() throws SQLException, ClassNotFoundException {
		InvoiceDAO invoiceDAO = new InvoiceDAO();
		return invoiceDAO.getAllInvoices();
	}
	public void updateInvoiceDetails(int id,Double amount) throws SQLException, ClassNotFoundException {
		InvoiceDAO invoiceDAO = new InvoiceDAO();
		invoiceDAO.updateInvoiceDetails(id,amount);
	}
	public Invoice getinvoice(Integer id)throws SQLException, ClassNotFoundException {
		InvoiceDAO invoiceDAO = new InvoiceDAO();
		return invoiceDAO.getinvoice(id);
	}
}
