package VisitorPattern;

class Bank extends Client{
  
    public Bank(String name,String id,String service){
      
        System.out.println("Name of the Bank : "+name);
       System.out.println("ID of the Bank :"+id);
       System.out.println("Service provided :"+service);
    }
    
    public void accept(Visitor visitor){
            visitor.visitBank(this);
    }
}
