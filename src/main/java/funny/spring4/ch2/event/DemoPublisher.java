package funny.spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 10:08 2018/3/3
 */

/**
 * 事件发布类
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;  //  1   注入ApplicationContext

    public void publist(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));   //  2   使用ApplicationContext的publishEvent方法来发布
    }
}
