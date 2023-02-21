package Day1;
import java.util.*;
public class Ex13 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of students : ");
		int n=input.nextInt();
		int Students[][]=new int[n][4];//n=4;
		for(int i=0;i<n;i++) {
			System.out.println("Student "+(i+1)+" marks for 4 subjects");
			for(int j=0;j<4;j++) {
			System.out.println("enter marks for subject" + (j+1)+" : ");
			Students[i][j]=input.nextInt();
			
		}}
		int sum=0;
		for(int i=0;i<n;i++) 
		{System.out.println("Result of student "+(i+1));
		sum=0;
			for(int j=0;j<4;j++) {
				sum=sum+Students[i][j];
				
			}
			System.out.println(sum);
		}
input.close();
	}
	
}
