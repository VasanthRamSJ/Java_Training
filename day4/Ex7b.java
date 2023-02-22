package day4;
import java.util.*;
public class Ex7b {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0, denominator;int i=0;
        while(i==0) {
            System.out.println("Enter the numerator:");
            try {
                numerator = sc.nextInt();
            }  catch(InputMismatchException e) {
            	System.out.println(e);
                return;
            }
            System.out.println("Enter the denominator:");
            denominator = sc.nextInt();
            AnException(numerator, denominator);i++;
        }
    }

    public static void AnException(int numerator, int denominator) {
        try {
            if(denominator == 0) {
                throw new ArithmeticException();
            }
            else if(numerator == 'q' || numerator == 'Q') {
                System.exit(0);
            }
            else {
                System.out.println("Quotient  - "+((float)numerator/denominator));
            }
        } catch(ArithmeticException exception) {
            System.out.println("Poor input data!");
            System.out.println(exception);
        }
    }
}
