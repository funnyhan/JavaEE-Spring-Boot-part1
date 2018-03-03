package funny.spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 17:45 2018/3/2
 */
@Service
@Scope("prototype") // 1 声明scope为prototype
public class DemoPrototypeService {
}
