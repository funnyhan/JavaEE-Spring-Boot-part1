package funny.spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 16:00 2018/3/2
 */

/**
 * 使用功能类的Bean
 * 1、使用@Service注解声明当前UseFunctionService类是Spring管理的一个Bean
 * 2、使用@Autowired将FunctionService的实体Bean注入到UseFunctionService中，让UserFunctionService具备FunctionService的功能
 *      此处使用JSR-330的@Inject注解或者JSR-250的@Resource注解是等效的。
 */
@Service    //1
public class UseFunctionService {
    @Autowired  //2
    FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
