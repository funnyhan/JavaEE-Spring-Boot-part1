package funny.spring4.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 18:25 2018/3/2
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProPostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }
}
