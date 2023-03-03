package Ex5.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
     static Map<String,BookType> booktypes=new HashMap<>();
	 
	 /** 
	  * @param type
	  * @param distributor
	  * @param otherData
	  * @return BookType
	  */
	 static BookType getBookType(String type,String distributor,String otherData)
	{
		if(booktypes.get(type)==null)
			{
			booktypes.put(type, new BookType(type,distributor,otherData));
			}
		
		return booktypes.get(type);
	}
}
