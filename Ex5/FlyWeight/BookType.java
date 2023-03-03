package Ex5.FlyWeight;

public class BookType {
    final String type;
    final String distributor;
    final String otherData;
	
    public BookType(String type,String distributor,String otherData) {
		this.type=type;
		this.distributor=distributor;
		this.otherData=otherData;
	}
}
