package funny.spring4.ch2.profile;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 9:16 2018/3/3
 */

/**
 * 示例Bean
 */
public class DemoBean {
    private String content;
    public DemoBean(String content){
        super();
        this.content = content;
    }
    public String getContent(){
        return content;
    }

}
