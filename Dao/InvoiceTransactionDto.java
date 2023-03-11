package Dao;

public class InvoiceTransactionDto {
	private String transactionId, invoiceNumber;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public InvoiceTransactionDto(String transactionId, String invoiceNumber) {
		super();
		this.transactionId = transactionId;
		this.invoiceNumber = invoiceNumber;
	}

	public InvoiceTransactionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
