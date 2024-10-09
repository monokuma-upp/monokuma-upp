package Thread.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable1 implements Callable<Boolean> {
    public Boolean call(){
        for(int i = 0; i < 100; i++){
            System.out.println("线程" + i);
        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
       Callable1 c = new Callable1();
       //创建执行服务
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        //提交执行
        Future<Boolean> result = executorService.submit(c);
        for(int i = 0; i < 10; i++){
            System.out.println("主线程" +i);
        }
        boolean r = result.get();
        executorService.shutdown();
    }
}