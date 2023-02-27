package Day1;
import java.util.*;
public class Ex19 {
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
	}
	System.out.println();
	for(int i=0;i<r;i++) {
		for(int j=c-1;j>=0;j--) {
			System.out.print(a[i][j]+" ");
			
		}
		System.out.println();
	}
	input.close();
}
}
