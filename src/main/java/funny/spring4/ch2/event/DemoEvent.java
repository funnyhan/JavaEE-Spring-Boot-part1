package funny.spring4.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 10:01 2018/3/3
 */

/**
 * 自定义事件
 */
public class DemoEvent extends ApplicationEvent{
    private static final long serialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source,String msg){
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
