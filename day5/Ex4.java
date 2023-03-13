package day5;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex4 {
	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(1);

		es.execute(() -> {

			Thread.currentThread().setName("time");
			while (true) {

				System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + ":"+ LocalTime.now().getSecond());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}

			}

		});

		es.shutdown();

	}
}
