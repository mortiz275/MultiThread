import java.util.Scanner;
import java.util.concurrent.*;

public class MultiThread{
	public static void main(String[] args) {
		ThreadEx thread = new ThreadEx();

		Thread readerThread = new Thread(new ReaderThread(thread));
		Thread totalThread = new Thread(new TotalThread(thread));

		Thread prodThread = new Thread(new ProductThread(thread));

		totalThread.start();
		prodThread.start();

		readerThread.start();



	}



}