package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InvoiceMasterDao {
	public int insertData(InvoiceMasterDto invoiceMasterDto) {
		try {
			Connection connection=DatabaseConnection.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("insert into InvoiceMaster values(?,?)");  
			
			prepareStatement.setString(1, invoiceMasterDto.getInvoiceNumber());
			prepareStatement.setString(2, invoiceMasterDto.getInvoiceSum());
			
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
