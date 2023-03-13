package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex2 {
	public static void main(String[] args) {
		Ex2 object = new Ex2();

		ExecutorService es = Executors.newFixedThreadPool(3);
		es.execute(() -> {
			Thread.currentThread().setName("messagePart1");
			try {

				object.messagePart1("[------");

			} catch (Exception e) {
				System.out.println(e);
			}
		});

		es.execute(() -> {
			Thread.currentThread().setName("messagePart2");
			try {

				object.messagePart1("message");

			} catch (Exception e) {
				System.out.println(e);
			}

		});

		es.execute(() -> {
			Thread.currentThread().setName("messagePart3");
			try {

				object.messagePart1("------]");

			} catch (Exception e) {
				System.out.println(e);
			}

		});
		es.shutdown();

	}

	synchronized void messagePart1(String msg) {
		System.out.print(msg);

	}

}
