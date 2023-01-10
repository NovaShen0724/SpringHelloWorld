package top.novashen;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//实验通过反射获得class method field对象和新建对象实例，并学习如何调用方法 字段 构造器
public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        User user = new User();
        Class<?> c1 = Class.forName("top.novashen.User");
        Method getName = c1.getDeclaredMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        getName.setAccessible(true);
        Object set = setName.invoke(user, "SYH");
        System.out.println(set);
        Object get = getName.invoke(user, null);
        System.out.println(get);

        Field name = c1.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println(name.get(user));
        name.set(user,"HZY");
        System.out.println(name.get(user));


    }
}

class User{
    private String name;
    private Integer age;

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }
}
