package Dao;

import java.sql.Connection;

public class DatabaseUsage {
	public static void main(String[] args) {
//		Connection connection= DatabaseConnection.getConnection();
//		System.out.println(connection);
		CustomerDto customerDto= new CustomerDto("Vasanth","2090");
		CustomerDao customerDao = new CustomerDao();
		InvoiceMasterDto invoiceMasterDto=new InvoiceMasterDto("1234579","146279");
		InvoiceMasterDao invoiceMasterDao= new InvoiceMasterDao();
		InvoiceTransactionDto invoiceTransactionDto=new InvoiceTransactionDto("abc112","1234579");
		InvoiceTransactionDao invoiceTransactionDao=new InvoiceTransactionDao();
		ItemMasterDto itemMasterDto=new ItemMasterDto("abc",20);
		ItemMasterDao itemMasterDao=new ItemMasterDao();
		customerDao.insertData(customerDto);
		invoiceMasterDao.insertData(invoiceMasterDto);
		invoiceTransactionDao.insertData(invoiceTransactionDto);
		itemMasterDao.insertData(itemMasterDto);
		
	}
}
