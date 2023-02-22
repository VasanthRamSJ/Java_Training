package day4;

public class Ex3 {
	public static void main(String args[]) {
		Sample1 s= new Sample1();
		s.mht1();
	}
}


class Sample1{
	public void mht1() {
		mht2();
		System.out.println("caller");
	}
	
	public void mht2() {
		
		try {
			int a=1/0;
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("catch-mht2")
;		}
		finally {
			System.out.println("finally-mht2");
		}
	}
}