package day2;

public class Ex8 {
	 public static void main(String args[])
	    {
	        Singleton x = Singleton.getInstance();
	        Singleton y = Singleton.getInstance();  
	        System.out.println("Hashcode of x is " + x.hashCode());
	        System.out.println("Hashcode of y is " + y.hashCode());
	        if (x == y) {
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
