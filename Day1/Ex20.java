package Day1;
import java.util.*;
public class Ex20 {
	public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter number of rows");
	int r =input.nextInt();
	System.out.println("enter number of columns");
	int c=input.nextInt();
	int a[][]=new int[r][c];
	for (int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			System.out.println("the element "+i+" "+j+" is ");
			a[i][j]=input.nextInt();
		}
	}
	System.out.println();
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}int max=0;
	input.close();
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			max=a[i][j];
			if(max>a[i][j]) {
		       max=a[i][j];}
		}
		System.out.println("the largest element in the row "+i+" is "+max);
	}
	
}
}