package Day1;

public class Ex11 {
public static void main(String args[]) {
	int a[][]= {{1},{2,3},{4,5,6},{7,8,9,10}};
	int b=1;
	for(int i=0;i<4;i++) {
		for(int j=0;j<b;j++) {
			System.out.print(a[i][j]+" ");
			
		}
		System.out.println();b++;
	}
}
}
