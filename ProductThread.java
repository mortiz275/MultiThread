public class ProductThread implements Runnable {
	
	ThreadEx value;

	public ProductThread(ThreadEx value) {
		this.value = value;
	}
	public void run(){
		value.printProduct();
	}
}