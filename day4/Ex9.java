package day4;
import java.util.*;

public class Ex9 {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int i=1;
	while(i==1) {
	System.out.println("enter the number : ");	
		int n=input.nextInt();
		try {
			if(n<0 || n>100) {
				throw new OutOfRangeException();
			}
			else {
				i++;
				System.out.println("Valid input");
			}
		}
		catch(OutOfRangeException e) {
			System.out.println(e);
		}
	}



}

}

class OutOfRangeException extends Exception{
	OutOfRangeException(){
		System.out.println("enter the number with in the range");
	}
	
	
	
}