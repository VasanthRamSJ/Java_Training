package FactoryPattern;
import java.util.*;
public class FactoryPattern {
    
    public static void main(String[] args) {
       BikeShowroom bikeShowroom=null;
      
       //BikeAssemble bikeAssemble=new BikeAssemble();
        Scanner scanner=new Scanner(System.in);
        String bikeCompanyName = scanner.next();
       // bikeAssemble.getBike(showroomName, bikeShowroom);
       bikeShowroom=new BikeShowroom();
       bikeShowroom.makeBike(bikeCompanyName);
       bikeShowroom= bikeAssemble(bikeShowroom, bikeCompanyName);
      
       
        
        scanner.close();
    }
    static BikeShowroom bikeAssemble(BikeShowroom bikeShowroom,String bikeName){
        if(bikeName.equals("Yamaha")){
            return new Yamaha();
            
           }
           else if(bikeName.equals("Hero")){
            return new Hero();
           
           }
           else if(bikeName.equals("TVS")){
            return new TVS();
           }
           else if(bikeName.equals("Bajaj")){
           return new Bajaj();
           }
          else{
            System.out.println("no such bikes found..");
            return null;
          
           }
    } 
    }
     abstract class Bike extends BikeShowroom{
       
    }
   
    class Yamaha extends BikeShowroom{	
        Yamaha(){
            System.out.println("The best bike FZ is made..Enjoy!!");
        }
       
    }
    class Bajaj extends BikeShowroom{
        Bajaj(){
            System.out.println("The best bike pulsar is made..Enjoy!!");
        }
       
        
    }
    class TVS extends BikeShowroom{
        TVS(){
            System.out.println("The best bike Apache RTR is made..Enjoy!!");
        }
        
    }
    class Hero extends BikeShowroom {
        Hero(){
        System.out.println("The best bike Hero+ is made..Enjoy!!");}
        
    
    }
      class BikeShowroom implements BikeManufacturingUnit{

        @Override
        public void makeBike(String bikeCompanyName) {
            System.out.println(bikeCompanyName+" company bike is on the making...");
        }

        
    }
      

    
interface BikeManufacturingUnit{
public  void makeBike(String bikeCompanyName );

}