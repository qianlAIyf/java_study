package MultiThread;

class ThreadTest implements Runnable{
    private Thread t;
    private String threadName;

    ThreadTest(String name){
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run(){
        System.out.println("Running " + threadName);
        try {
            for(int i = 4; i > 0; i --){
                System.out.println("Thread " + threadName + ", " + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread " + threadName + "interrupted!");
        }
    }

    public void start(){
        System.out.println("Starting " + threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class RunableTest {
    public static void main(String [] args){
        ThreadTest threadTest = new ThreadTest("Thread 1");
        threadTest.start();

        ThreadTest threadTest1 = new ThreadTest("Thread 2");
        threadTest1.start();
    }
}
