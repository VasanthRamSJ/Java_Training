package Dao;

public class InvoiceMasterDto {
private String invoiceNumber,invoiceSum;

public String getInvoiceNumber() {
	return invoiceNumber;
}

public void setInvoiceNumber(String invoiceNumber) {
	this.invoiceNumber = invoiceNumber;
}

public InvoiceMasterDto() {
	super();
	// TODO Auto-generated constructor stub
}

public InvoiceMasterDto(String invoiceNumber, String invoiceSum) {
	super();
	this.invoiceNumber = invoiceNumber;
	this.invoiceSum = invoiceSum;
}

public String getInvoiceSum() {
	return invoiceSum;
}

public void setInvoiceSum(String invoiceSum) {
	this.invoiceSum = invoiceSum;
}
}
