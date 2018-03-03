package funny.spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 10:59 2018/3/3
 */

/**
 * 任务执行类
 */
@Service
public class AsyncTaskService {
    @Async  //  1   通过@Async注解表明该方法是个异步方法，如果注解在类级别，则表明该类的方法都是异步方法，而这里的方法自动被注入使用ThreadPoolTaskExecutor左右TaskExecutor
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1:"+(i+1));
    }
}
