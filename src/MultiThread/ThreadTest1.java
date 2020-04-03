package MultiThread;

class ThreadDemo extends Thread{
    private Thread t;
    private String threadName;

    ThreadDemo(String name){
        this.threadName = name;
        System.out.println("Creating " + threadName);
        System.out.println();
    }

    public void run(){
        System.out.println("Running " + threadName);
        try{
            for(int i = 4; i > 0; i --){
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread " + threadName + " interrupted!");
            e.printStackTrace();
        }
    }

    public void start(){
        System.out.println("Starting " + threadName);
        if(t == null ){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class ThreadTest1 {
    public static void main(String [] args){
        ThreadTest threadTest = new ThreadTest("thread");
        threadTest.start();

        ThreadTest threadTest1 = new ThreadTest("thread1");
        threadTest1.start();
    }
}
