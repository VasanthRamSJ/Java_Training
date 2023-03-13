package VisitorPattern;

public class InsuranceMessenger implements Visitor{

    public void visitBank(Bank bank){
        System.out.println("Bank theft insurance details");
    }
    
    
    
    public void visitHotel(Hotel hotel){
        System.out.println("Hotel food insurance details");
    }

    public void insuranceMails(Client client){
        
            client.accept(this);
        
    }
}
