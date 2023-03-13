package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ItemMasterDao {
	public int insertData(ItemMasterDto itemMasterDto) {
		try {
			Connection connection=DatabaseConnection.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("insert into ItemMaster values(?,?)");  
			
			prepareStatement.setString(1, itemMasterDto.getItemName());
			prepareStatement.setInt(2, itemMasterDto.getItemcost());
			
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
