package day2;

public class Ex8 {
	 public static void main(String args[])
	    {
	        Singleton singleton = Singleton.getInstance();
	        Singleton singleton2 = Singleton.getInstance();  
	        System.out.println("Hashcode of x is " + singleton.hashCode());
	        System.out.println("Hashcode of y is " + singleton2.hashCode());
	        if (singleton == singleton2) {
	            System.out.println(
	                "two object references point to the same memory location on the heap i.e, to the same object");
	        }
	        else {
	            System.out.println(
	                "two objects references DO NOT point to the same memory location on the heap");
	        }
	    }
}
class Singleton {
    private static Singleton single_instance = null;
    public String s;
    private Singleton()
    {
        System.out.println("Hello I am a string part of Singleton class");
    }
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
  
        return single_instance;
    }
}
