package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public DatabaseConnection() {
		// TODO Auto-generated constructor stub
	}
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public static Connection getConnection() {
		
			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Vasanth","root","Vasanth123*");
				connection.setAutoCommit(false);
				return connection;
			} catch (SQLException e) {
				
				System.out.println(e);
				return null;
			}
		
	}
	
	public static void closeConnection(Exception e,Connection connection) {
		//get connection from thread local
		
		
		
		if(connection!=null) {
			try {
				if(e==null) {
					connection.commit();
				}else {
					connection.rollback();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2);
			}
			finally {
				try {
					connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println(e1);
				}
				
			}
		}
}
}