package Dao;

public class CustomerDto {
private String name , id;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public CustomerDto() {
	super();
	// TODO Auto-generated constructor stub
}

public CustomerDto(String name, String id) {
	super();
	this.name = name;
	this.id = id;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
}
