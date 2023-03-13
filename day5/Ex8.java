package day5;

public class Ex8 extends Thread {

	public static void main(String[] args) {
		StringBuffer string = new StringBuffer("A");
		MyThread1 thread1 = new MyThread1(string);
		MyThread1 thread2 = new MyThread1(string);
		MyThread1 thread3 = new MyThread1(string);
		thread1.start();
		thread2.start();
		thread3.start();

	}

}

class MyThread1 extends Thread {
	StringBuffer string;

	MyThread1(StringBuffer string) {
		this.string = string;
	}

	@Override
	public void run() {

		synchronized (string) {
			for (int i = 0; i < 100; i++) {
				System.out.print(string + " ");
			}
			System.out.println("");
			System.out.print("Thread completed");
			System.out.println();
			int character = string.charAt(0);
			string.replace(0, 1, (char) (character + 1) + "");

		}
	}
}
