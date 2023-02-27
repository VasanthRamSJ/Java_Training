package Day1;
import java.util.*;
public class Ex16 {
 public static void main(String args[]) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("enter the size of array : ");
	 int n=input.nextInt();
	 int a[]=new int[n];
	 
	 for(int i=0;i<n;i++) {
		 System.out.println("enter element "+i);
		 a[i]=input.nextInt();
		 
	 }
	 System.out.println("enter the element to be searched : ");
	 int x=input.nextInt(),b=0;
	 System.out.println("The numbers are in the position : ");
	 for(int i=0;i<n;i++) {
		 if(a[i]==x) {
			 System.out.println(i+" ");
			 b++;
		 }
		 
	 }
	 if(b==0) {
		 System.out.println("There is no such element in any position");
	 }
	 else{
		 System.out.println("The element occurs "+b+" time(s) in the array");
		 
	 }
	
	 input.close();
 }
}
