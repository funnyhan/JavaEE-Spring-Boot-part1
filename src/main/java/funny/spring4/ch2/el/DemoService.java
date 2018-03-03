package funny.spring4.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 17:54 2018/3/2
 */

/**
 * 需要被注入的Bean
 */
@Service
public class DemoService {
    @Value("其他类的属性")   // 1 此处为注入普通字符串
    private String another;

    public String getAnother(){
        return another;
    }

    public void setAnother(String another){
        this.another = another;
    }
}
