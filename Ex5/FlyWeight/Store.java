package Ex5.FlyWeight;

import java.util.ArrayList;
import java.util.List;

class Store{
     List<Book> book=new ArrayList<>();
	
	/** 
	 * @param name
	 * @param price
	 * @param type
	 * @param distributor
	 * @param otherData
	 */
	public void storeBook(String name,double price,String type,String distributor,String otherData)
	{
		BookType booktype=BookFactory.getBookType(type, distributor, otherData);
		System.out.println(booktype);
		book.add(new Book(name,price,booktype));
	}
	
}