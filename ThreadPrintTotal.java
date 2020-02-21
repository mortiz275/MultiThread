//Creates a Thread that prints the total

public class ThreadPrintTotal implements Runnable{
	ThreadEx value;

	public ThreadPrintTotal(ThreadEx v){
		value= v;
	}
	public void run(){
		value.totalPrinter();
	}
}