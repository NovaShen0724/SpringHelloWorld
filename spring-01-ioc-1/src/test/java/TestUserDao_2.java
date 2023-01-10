import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.novashen.service.UserService;

public class TestUserDao_2 {
    //用SpringIoC控制对象的创建
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.getUser();
    }
}
