import java.util.Scanner;

public class ThreadEx {
	int num1, num2 = 1;
	int total = 0;
	int product = 1;

	public void reader(){
		Scanner scanner = new Scanner(System.in);

		while (true) {
			num1 = scanner.nextInt();
			num2 = num1;
		}

	}
	public void printTotal() {
		while (true) {
			try {
				Thread.currentThread().sleep(3 * 1000);
			} catch (InterruptedException ie) {}


			total += num1;

			num1 = 0;
			System.out.println("Total sum: " + total);
		}

	}


	public void printProduct() {
		while (true) {
			try {
				Thread.currentThread().sleep(5 * 1000);
			} catch (InterruptedException ie) {}


			product *= num2;

			num2 = 1;
			System.out.println("Product: " + product);
		}

	}


}