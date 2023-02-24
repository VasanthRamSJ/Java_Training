package day4;

public class Ex6 {
	public static void main(String args[]) throws Exception {
		DerivedClass derived = new DerivedClass();

	}
}

class BaseClass {
	BaseClass() throws Exception {
		try {
			int a = 1 / 0;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("code after exception");
	}

}

class DerivedClass extends BaseClass {

	public DerivedClass() throws Exception {
		super();
	}
}