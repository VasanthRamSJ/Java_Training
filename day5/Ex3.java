package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Scanner;

public class Ex3 {

	boolean flag = false;

	public static void main(String[] args) {
		Ex3 obj = new Ex3();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number products to be produced and consumed : ");
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 100; i++) {
			es.execute(() -> {
				Thread.currentThread().setName("producer");
				obj.producer();
			});

			es.execute(() -> {
				Thread.currentThread().setName("consumer");
				obj.consumer();
			});
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
			
			}
		}
		scan.close();
		es.shutdown();
	}

	synchronized void producer() {

		try {
			if (flag) {
				wait();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("item produced");
		flag = true;
		notify();
	}

	synchronized void consumer() {

		try {
			if (!flag) {
				wait();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("item consumed");
		flag = false;
		notify();
	}
}
