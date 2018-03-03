package funny.spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 16:40 2018/3/2
 */

/**
 * 注解本身是没有功能的，就和xml一样，注解和xml都是一种元数据。
 * 元数据即解释数据的数据，这就是所谓的配置。
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
