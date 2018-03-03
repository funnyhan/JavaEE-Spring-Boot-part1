package funny.spring4.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 18:22 2018/3/2
 */

/**
 * 配置类
 */
@Configuration
@ComponentScan("funny.spring4.ch2.prepost")
public class ProPostConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")    //  1   在initMethod和destroyMethod指定BeanWayService类的init和destroy方法在构造之后，Bean销毁之前执行
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
