package top.novashen.pojo;

import org.springframework.stereotype.Component;

//等价于<bean id="user" class="top.novashen.pojo.User"/>
@Component
public class User {
    private String name="SYH";

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
