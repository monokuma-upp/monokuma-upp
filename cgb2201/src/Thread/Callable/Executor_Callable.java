package Thread.Callable;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Executor_Callable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();//新建了一个线程池
        List<Future<String>> resultList = new ArrayList<Future<String>>();//新建一个列表用来储存future对象的返回值

        //创建10个任务并执行
        for(int i = 0; i < 10; i++){
            //用ExecutorService执行Callable类型的任务，并将结果保存在future变量中
            Future<String> future = executorService.submit(new TaskWithResult(i));
            resultList.add(future);
        }

        //遍历任务的结果
        for(Future<String> fs: resultList){
            try{
                while(!fs.isDone());
                System.out.println(fs.get());

            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            catch(ExecutionException e){
                e.printStackTrace();
            }
            finally{
                executorService.shutdown();
            }
        }
    }
}

class TaskWithResult implements Callable<String>{
    private int id;

    public TaskWithResult(int id){
        this.id = id;
    }

    public String call() throws Exception{
        System.out.println("call()方法被自动调用！！！    " + Thread.currentThread().getName());
        return "call()方法被自动调用，任务返回的结果是：" + id + "    " + Thread.currentThread().getName();
    }
}
