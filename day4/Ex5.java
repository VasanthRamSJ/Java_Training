package day4;

public class Ex5 {
	public static void main(String[] args) throws DogBiteException {
		Ex5 ex = new Ex5();
		ex.play();
		System.out.println("vasanth");

	}

	void play() throws DogBiteException {
		throw new DogBiteException("this line wont execute without catch");

	}
}
