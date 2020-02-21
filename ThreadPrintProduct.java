
public class ThreadPrintProduct implements Runnable{
	ThreadEx value;

	public ThreadPrintProduct(ThreadEx v){
		value= v;
	}
	public void run(){
		value.productCalc();
	}
}