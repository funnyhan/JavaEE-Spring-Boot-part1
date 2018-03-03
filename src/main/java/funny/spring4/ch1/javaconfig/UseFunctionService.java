package funny.spring4.ch1.javaconfig;



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
 //1  此处没有使用@Service声明Bean
public class UseFunctionService {
    //2 此处没有使用@Autowired注解注入Bean
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
