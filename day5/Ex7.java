package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex7 {
	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(2);

		es.execute(() -> {

			Thread.currentThread().setName("count");
			int count = 1, temp = 10;
			while (count <= 100) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
				if (count == temp) {

					System.out.println(count);
					System.out.println(temp + " numbers completed ");
					count++;
					temp = temp + 10;
				} else {
					System.out.println(count);
					count++;
				}
			}
		});

		es.shutdown();
	}
}
