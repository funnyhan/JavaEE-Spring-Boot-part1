package funny.spring4.ch3.annotation;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 14:32 2018/3/3
 */

import org.springframework.stereotype.Service;

/**
 * 演示服务Bean
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得bean");
    }
}
