import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.novashen.pojo.Human;

public class Test1 {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        Human human = context.getBean("human", Human.class);
        human.getCat().shout();
        human.getDog().shout();
        String s;
    }
}
