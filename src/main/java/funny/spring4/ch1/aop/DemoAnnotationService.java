package funny.spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 17:13 2018/3/2
 */

/**
 * 使用注解的被拦截类
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){}
}
