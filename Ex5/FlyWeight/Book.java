package Ex5.FlyWeight;

public class Book {
     String name;
     double price;
     BookType type;
    public Book(String name,double price,BookType type) {
		this.name=name;
		this.price=price;
		this.type=type;
	}
}
