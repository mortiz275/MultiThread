public class ReaderThread implements Runnable {
	ThreadEx value;
	public ReaderThread(ThreadEx value) {
		this.value = value;
	}

	public void run(){
		value.reader();
	}
}