package day5;

/*import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;*/

public class Ex5 {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		thread.start();

	}
}

class MyThread extends Thread {
	public void run() {

	}
}