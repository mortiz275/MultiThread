public class TotalThread implements Runnable {

	ThreadEx value;


	public TotalThread(ThreadEx value) {
		this.value = value;
	}
	public void run(){
		value.printTotal();
	}
}