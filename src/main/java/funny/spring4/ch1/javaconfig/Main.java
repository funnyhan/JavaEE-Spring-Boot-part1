package funny.spring4.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 16:17 2018/3/2
 */
public class Main {
    public static void main(String[] args) {
        //  使用AnnotationConfigApplicationContext作为Spring容器，接受输入一个篇配置类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        // 获得声明配置的UserFunctionService的Bean
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("java config"));
        context.close();
    }
}
