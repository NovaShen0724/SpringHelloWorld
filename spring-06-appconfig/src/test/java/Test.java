import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.novashen.config.MyConfig;
import top.novashen.pojo.User;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        Object test = context.getBean("getUser");
        User test = context.getBean("user", User.class);
        System.out.println(test);
//        System.out.println(user);
    }
}
