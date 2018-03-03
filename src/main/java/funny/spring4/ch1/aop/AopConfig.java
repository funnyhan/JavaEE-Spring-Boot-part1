package funny.spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 17:34 2018/3/2
 */
@Configuration
@ComponentScan("funny.spring4.ch1.aop")
@EnableAspectJAutoProxy //1 使用@EnableAspectJAutoProxy注解开启Spring对AspectJ代理的支持
public class AopConfig {
}
