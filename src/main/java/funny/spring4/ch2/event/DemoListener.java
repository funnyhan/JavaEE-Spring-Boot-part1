package funny.spring4.ch2.event;

import funny.spring4.ch2.event.DemoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 10:04 2018/3/3
 */

/**
 * 事件监听类
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {   //1 实现ApplicationListener
    public void onApplicationEvent(DemoEvent event){    //2 使用onApplicationEvent方法对消息进行接受处理
        String msg = event.getMsg();
        System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息："+msg);
    }
}
