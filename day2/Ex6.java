package day2;

public class Ex6 {
	Ex6(int x)
    {
        System.out.println("ONE argument constructor");
    }
  
    Ex6()
    {
        System.out.println("No  argument constructor");
    }
  
    static
    {
        System.out.println("1st static init");
    }
  
    {
        System.out.println("1st instance init");
    }
  
    {
        System.out.println("2nd instance init");
    }
  
    static
    {
        System.out.println("2nd static init");
    }
  
    public static void main(String[] args)
    {
        new Ex6();
        new Ex6(8);
    }
}
