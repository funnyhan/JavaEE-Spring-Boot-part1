package funny.spring4.ch3.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 14:29 2018/3/3
 */

/**
 * 实例组合元注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration  //  1   组合@Configuration元注解
@ComponentScan  //  2   组合@ComponentScan元注解
public @interface FunnyConfiguration {
    String[] value() default  {};   //  3   覆盖value参数
}
