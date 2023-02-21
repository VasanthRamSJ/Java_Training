package Day1;
import java.util.*;
public class Ex5 {
	public static void main(String aruments[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number n : ");
		int n=input.nextInt();
		System.out.println(average(n));
		input.close();
	}
	static int average(int n) {
	Scanner input = new Scanner(System.in);
	int sum=0,i;
		for(i=1;i<=n;i++) {
			System.out.println("Enter input " + i);
			int no=input.nextInt();
			sum=sum+no;
		}
		System.out.println("Average of the given numbers is : ");
		n=sum/(i-1);
		
		return n;
	}
	
}
