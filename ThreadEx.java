import java.util.concurrent.*;
import java.util.Scanner;

public class ThreadEx{
	int value= 1;
	public void totalPrinter(){
		for(;;){
			try {
				System.out.println(Thread.currentThread().getName()+": "+value);
                Thread.currentThread().sleep(1000*2);
			} catch (InterruptedException ie){}
		}
    }


    public void productCalc() {
        for(;;){
            try{
                System.out.println(Thread.currentThread().getName()+": Product: "+(value*value));
                Thread.currentThread().sleep(1000*3);
            } catch(InterruptedException ie){

            }
            
        }
    }
	public void reader(){
		for(;;){
			Scanner sc= new Scanner(System.in);
			value= sc.nextInt();
		}
	}
}