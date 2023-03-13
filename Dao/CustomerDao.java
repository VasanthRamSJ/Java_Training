package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerDao {


	public int insertData(CustomerDto customerDto) {
		try {
			Connection connection=DatabaseConnection.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("insert into customer values(?,?)");  
			
			prepareStatement.setString(1, customerDto.getName());
			prepareStatement.setString(2, customerDto.getId());
			
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
