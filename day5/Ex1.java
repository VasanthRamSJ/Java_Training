package day5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex1 {
	public static void main(String[] args) {
		Ex1 reference = new Ex1();
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			Thread.currentThread().setName("odd numbers");
			synchronized(reference) {
				reference.oddNumbers();
			}
			
		});
		
		es.execute(()->{
			Thread.currentThread().setName("even numbers");
			synchronized(reference) {
				reference.evenNumbers();
			
			}
		});
		
		es.shutdown();
	}
	 
	void evenNumbers() {
		System.out.println("The even numbers from 1 to 100 are : ");

		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			else {
				continue;
			}
		}
	}
	void oddNumbers() {
		System.out.println("The odd numbers from 1 to 100 are : ");

		for(int i=0;i<100;i++) {
			if(i%2==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
}
