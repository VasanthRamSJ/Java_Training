package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InvoiceTransactionDao {
	public int insertData(InvoiceTransactionDto invoiceTransactionDto) {
		try {
			Connection connection=DatabaseConnection.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("insert into InvoiceTransaction values(?,?)");  
			
			prepareStatement.setString(1, invoiceTransactionDto.getInvoiceNumber());
			prepareStatement.setString(2, invoiceTransactionDto.getTransactionId());
			
			int result=prepareStatement.executeUpdate();
			DatabaseConnection.closeConnection(null, connection);
			System.out.println("inserted values..");
			return result;
			
		}
		catch(Exception e) {
			System.out.println(e);
			return 0;
		}
		
	}
}
