package day2;
import java.util.*;
public class Ex1 {
	int x;
    public static void main(String[] args) {
        int n = 9;
        double d = 16.0d;
        Ex1 e = new Ex1();
        int []a = new int[] {0,0,0,0,0};
        System.out.println("before function call : "+n+", "+d);
        primitive(n, d);
        System.out.println(" after function call : "+n+", "+d);
        System.out.println("Array values before function call:"+Arrays.toString(a));
        array(a);
        System.out.println("Array values after function call:"+Arrays.toString(a));
        System.out.println("Value of class member x before function call : "+e.x);
        object(e);
        System.out.println("Value of class member x after function call : "+e.x);
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

