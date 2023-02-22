package day4;
//import java.util.*;
public class Ex4 {
public static void main(String[] args) {
		Dog dog=new Dog();
		try {
		dog.play("stick");}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
class Dog
{
  public void play(String item)throws DogBiteException{
	  if(item.equals("stick")) {
		  throw new DogBiteException("YOU BEAT I BITE");
	  }
	 
	  
	  else {
		  System.out.println("NO EXCEPTION");
	  }
  }
	
	}

class DogBiteException extends Exception{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return msg;
	}
	
}