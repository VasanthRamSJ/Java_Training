package day2;
import java.util.*;
public class Ex1 {
	int x;
    public static void main(String[] args) {
        int integer = 9;
        double doubles = 16.0d;
        Ex1 ex = new Ex1();
        int []array = new int[] {0,0,0,0,0};
        System.out.println("before function call : "+integer+", ");
        primitive(integer, doubles);
        System.out.println(" after function call : "+integer+", "+doubles);
        System.out.println("Array values before function call:"+Arrays.toString(array));
        array(array);
        System.out.println("Array values after function call:"+Arrays.toString(array));
        System.out.println("Value of class member x before function call : "+ex.x);
        object(ex);
        System.out.println("Value of class member x after function call : "+ex.x);
    }

    public static void primitive(int n, double d) {
        n =n+1;
        d =d-2.5f;
    }

    public static void array(int []a) {
        for(int i=0; i<a.length; i++)
            a[i]=a[i]+1;
    }

    public static void object(Ex1 d) {
        d.x = 190;
    }
}

