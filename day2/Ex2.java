package day2;

public class Ex2 {
	
    int real, image;
 
   
    public Ex2(int r, int i)
    {
        this.real = r;
        this.image = i;
    }
 
   
    public void showC()
    {
        System.out.print(real + " +i" + image);
    }
 
    public static Ex2 add(Ex2 n1,
                                    Ex2 n2)
    {
 
                Ex2 res = new Ex2(0, 0);
 
        res.real = n1.real + n2.real;
 
        res.image = n1.image + n2.image;
 
        return res;
    }
    
    public static void main(String arg[])
    {
 
        Ex2 c1 = new Ex2(4, 5);
        Ex2 c2 = new Ex2(10, 5);
 
     
          System.out.print("first Complex number: ");
        c1.showC();
         
        System.out.print("\nSecond Complex number: ");
        c2.showC();
 
        Ex2 res = add(c1, c2);
 
        System.out.println("\nAddition is :");
        res.showC();
    }
 
  
}
