package VisitorPattern;

public class Company extends Client {
    int noOfEmployees;
    Company(String name,String id, int noOfEmployees){
      
        this.noOfEmployees=noOfEmployees;
    }

    public void accept(Visitor visitor){

    }
}
