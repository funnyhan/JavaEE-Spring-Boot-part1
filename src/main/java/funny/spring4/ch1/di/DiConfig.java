package funny.spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 16:13 2018/3/2
 */

/**
 * 1、@Configuration声明当前类是一个配置类
 * 2、使用@ComponentScan，自动扫描包名下所有使用@Service、@Component、@Repository和@Controller的类，并注册为Bean
 */
@Configuration  //1
@ComponentScan("funny.spring4.ch1") //2
public class DiConfig {

}
