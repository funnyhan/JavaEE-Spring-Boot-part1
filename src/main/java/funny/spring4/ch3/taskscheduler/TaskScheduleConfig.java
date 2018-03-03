package funny.spring4.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 11:41 2018/3/3
 */
@Configuration
@ComponentScan("funny.spring4.ch3.taskscheduler")
@EnableScheduling //通过@EnableScheduling注解开启对计划任务的支持
public class TaskScheduleConfig {
}