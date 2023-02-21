package Day1;

public class Ex27 {
 public static void main(String args[]) {
	double investment =14_000;
	 
	
	 investment=(double)(((double)investment*(double)((double)40/(double)100))+(double)investment);
	 System.out.println("the investmemnt in first year is "+investment);

	 investment=(double)investment-(double)1500;
	 System.out.println("the investment in second year is "+investment);

	 investment=(double)(((double)investment*(double)((double)12/(double)100))+(double)investment);
	 System.out.println("the investment in third year is "+investment);
	 
 }
}
