package funny.spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 9:22 2018/3/3
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev"); //  1   先将活动的Profile设置为prod
        context.register(ProfileConfig.class);  //  2   后置注册Bean配置类，不然会报Bean未定义的错误
        context.refresh();  //  3   刷新容器
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }

}
