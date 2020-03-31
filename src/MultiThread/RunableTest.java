package MultiThread;

class ThreadTest implements Runnable{
    private Thread t;
    private String threadName;

    ThreadTest(String name){
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run(){

    }
}

public class RunableTest {

}
