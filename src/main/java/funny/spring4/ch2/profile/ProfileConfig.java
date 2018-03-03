package funny.spring4.ch2.profile;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 9:18 2018/3/3
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Profile配置
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev") // 1    Profile为dev时实例化devDemoBean
    public DemoBean prodDemoBean(){
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod")    //  2   Profile为prod时实例化prodDemoBean
    public DemoBean proDemoBean(){
        return new DemoBean("from production profile");
    }
}
