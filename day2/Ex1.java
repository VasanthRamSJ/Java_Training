package day2;

public class Ex1 {
	public static void main(String[] args) {
	    int [] arr = new int[2];
	    arr[0] = 4;
	    arr[1] = 5;

	    changeContent(arr);

	    System.out.println(arr[0]);  
	  
	    changeRef(arr);

	    System.out.println(arr[0]);  
	}
	public static void changeContent(int[] arr) {

		   arr[0] = 10;  
		}

		public static void changeRef(int[] arr) {
		  
		   arr = new int[2];  
		   arr[0] = 15;
		}
}
