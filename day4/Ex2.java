package day4;

public class Ex2 {
	public static void main(String args[]) {
		Sample s = new Sample();
		s.mht1();
	}
}

class Sample {
	public void mht1() {
		mht2();
		System.out.println("caller");
	}

	public void mht2() {

		try {
			 int a=1/0;
			return;
		}

		catch (Exception e) {
			System.out.println("catch-mht2");
		}

		finally {
			System.out.println("finally-mht2");
		}
	}
}