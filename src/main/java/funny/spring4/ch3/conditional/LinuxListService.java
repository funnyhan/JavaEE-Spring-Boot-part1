package funny.spring4.ch3.conditional;

/**
 * @Author:hanchengke
 * @Description:
 * @Date:Created in 14:17 2018/3/3
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
