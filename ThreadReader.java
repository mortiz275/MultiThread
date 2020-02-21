
public class ThreadReader implements Runnable{
	ThreadEx value;

	public ThreadReader(ThreadEx v){
		value=v;
	}

	public void run(){
		value.reader();
	}
}