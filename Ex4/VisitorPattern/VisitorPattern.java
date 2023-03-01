package VisitorPattern;
public class VisitorPattern{
    public static void main(String[] args) {
        InsuranceMessenger insuranceMessenger = new InsuranceMessenger();

        Client client[] = new Client[2];
        client[0]= new Bank("hdfc", "001", "transaction");
        client[1]= new Hotel("anjappar", "002", "dining");
        
        insuranceMessenger.insuranceMails(client[0]);
    }

}