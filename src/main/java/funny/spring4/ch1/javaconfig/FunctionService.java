package funny.spring4.ch1.javaconfig;

import org.springframework.stereotype.Service;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 15:58 2018/3/2
 */

/**
 * 功能类bean
 * 1、使用@Service注解声明当前FunctionService类是Spring管理的一个Bean.
 * 其中，使用@Component、@Service、@Repository和@Controller是等效的,可根据需要选用
 */
//1  此处没有使用@Service声明Bean
public class FunctionService {
    public String sayHello(String word){
        return "Hello "+ word + " !";
    }
}
