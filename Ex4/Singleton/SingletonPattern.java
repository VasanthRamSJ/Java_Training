package Singleton;

public class SingletonPattern {
	public static void main(String[] args) {

		Singleton reference_1 = Singleton.createInstance();
		Singleton reference_2 = Singleton.createInstance();
		reference_1.print();
		reference_2.print();
	}
}