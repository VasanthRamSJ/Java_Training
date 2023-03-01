package VisitorPattern;


class Hotel extends Client{
  
    public Hotel(String name,String id,String service){
       
       System.out.println("Name of the Hotel : "+name);
       System.out.println("ID of the Hotel :"+id);
       System.out.println("Service provided :"+service);
    }
    public void accept(Visitor visitor){
        visitor.visitHotel(this);
    }
}
