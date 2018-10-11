import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InvoiceDAO {

	public List<Invoice> getAllInvoices() throws ClassNotFoundException, SQLException {
		Connection con =DbConnection.getConnection();
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM invoice ORDER BY id");
		List<Invoice>invoiceDBList = new ArrayList<Invoice>();

		while(rs.next())
		{
			Invoice invoiceObj = new Invoice(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDouble(5),rs.getString(6));//gets data from table and send to role constructor
			invoiceDBList.add(invoiceObj);
		}
		rs.close();
		con.close();

		return invoiceDBList;

	}
	
	public void updateInvoiceDetails(Integer invoiceId, Double amount) throws ClassNotFoundException, SQLException{
		try{

			ResultSet rs = getresultset(invoiceId);
			Integer paymentatt =0;
			Double balance=0.0;

			while(rs.next())
			{
				paymentatt = rs.getInt(3);
				paymentatt= paymentatt+1;
			 	balance = rs.getDouble(5);
				balance = balance -amount;
			}



			Connection conn = DbConnection.getConnection();

			String updateTableSQL = "UPDATE invoice SET payment_attempts = ? , balance = ?  WHERE id = ?";

			// String updateq = "update item set 'price' =  + price + " where id=" + item.getId();
			// "update`user` set `exp` = '666'  where `username` = '"+loggedusername+"'"
			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(updateTableSQL);


			preparedStmt.setInt(1,paymentatt);
			preparedStmt.setDouble(2,balance);
			preparedStmt.setInt(3,invoiceId);
			preparedStmt.executeUpdate();
			conn.close();
		}
		catch (ClassNotFoundException cs){
			System.out.println(cs.getCause());
		}
		catch (SQLException sq){
			System.out.println(sq.getCause());
		}
	}
	public Invoice getinvoice(Integer invoiceId) throws ClassNotFoundException, SQLException{
		ResultSet rs = getresultset(invoiceId);
		Invoice invoiceObj=null;
		while(rs.next()) {
			invoiceObj = new Invoice(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getString(6));
		}
		return invoiceObj;
	}
	private ResultSet getresultset(Integer invoiceId) throws ClassNotFoundException, SQLException{
		Connection connection = DbConnection.getConnection();

		Statement s = connection.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM invoice WHERE id = " + invoiceId + " ORDER BY id" ) ;
		//connection.close();
		return rs;
	}
}
