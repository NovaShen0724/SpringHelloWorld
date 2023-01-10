import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.novashen.pojo.HelloWorld;

public class TestSpringBean {
    public static void main(String[] args) {
        //利用Spring的IoC容器管理beans对象，使用时从context中取出即可
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        HelloWorld helloWorld= (HelloWorld) context.getBean("helloWorld");
//        System.out.println(helloWorld);
    }
}
