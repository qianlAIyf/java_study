package MultiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest implements Callable<Integer> {
       /*   1. 创建 Callable 接口的实现类，并实现 call() 方法，该 call() 方法将作为线程执行体，并且有返回值。

            2. 创建 Callable 实现类的实例，使用 FutureTask 类来包装 Callable 对象，该 FutureTask 对象封装了该 Callable 对象的 call() 方法的返回值。

            3. 使用 FutureTask 对象作为 Thread 对象的 target 创建并启动新线程。

            4. 调用 FutureTask 对象的 get() 方法来获得子线程执行结束后的返回值。*/
    public static void main(String [] args){
        CallableTest callableTest = new CallableTest();
        FutureTask<Integer> futureTask = new FutureTask<>(callableTest);

        for(int i = 0; i < 3; i ++){
            System.out.println(Thread.currentThread().getName() + " of loop variable's value" + i);
            if(i == 2){
                new Thread(futureTask, "Thread with return value").start();
            }
        }

        try {
            System.out.println("subThread's return value: " + futureTask.get());
        }catch (InterruptedException i){
            i.printStackTrace();
        } catch (ExecutionException e){
            e.printStackTrace();
        }
    }

    @Override
    public Integer call() throws Exception{
        int i = 0;
        for(; i < 3; i ++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;
    }
}
