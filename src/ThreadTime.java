public class ThreadTime extends Thread{
    ThreadTime(){
        super("My Thread");
        start();
    }
    public void run(){
        System.out.println(this);
    }
}
class Multithreaded_programming{
    public static void main(String[] args) {
        new ThreadTime();

        //output
        //Thread[My Thread,5,main]
    }
}
