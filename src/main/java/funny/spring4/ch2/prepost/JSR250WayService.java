package funny.spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 18:20 2018/3/2
 */

/**
 * 使用JSR250形式的Bean
 */
public class JSR250WayService {
    @PostConstruct  //1 @PostConstruct ，在构造函数执行之后执行
    public void init(){
        System.out.println("jsr250-init-method");
    }
    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }
    @PreDestroy //2 @PreDestroy，在Bean销毁之前执行
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }
}
