public class MultiThread{
    public static void main(String[] args){
        System.out.println("MultiThread...");
        ThreadEx value= new ThreadEx();
        Thread read= new Thread(new ThreadReader(value));
        Thread printTotal= new Thread(new ThreadPrintTotal(value));
        Thread printProduct= new Thread(new ThreadPrintProduct(value));

        read.start();
        printTotal.start();
        printProduct.start();

        try{
            read.join();
            printTotal.join();
            printProduct.join();
        }catch(InterruptedException ie){

        }

    }
}