package top.novashen;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//测试git提交到github是否成功
//探究反射带来的性能问题
public class Test4 {
    private static void testNormal() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class<? extends User> c1 = user.getClass();
        Method setAge = c1.getMethod("setAge", Integer.class);
        Method getAge = c1.getMethod("getAge", null);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.setAge(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通调用set"+(endTime-startTime));
        startTime=System.currentTimeMillis();
        int asd;
        for (int i = 0; i < 1000000000; i++) {
            asd=user.getAge();
        }
        endTime=System.currentTimeMillis();
        System.out.println("普通调用get"+(endTime-startTime));
    }
    private static void testReflection() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class<? extends User> c1 = user.getClass();
        Method setAge = c1.getMethod("setAge", Integer.class);
        Method getAge = c1.getMethod("getAge", null);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            setAge.invoke(user,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射调用set"+(endTime-startTime));
        startTime = System.currentTimeMillis();
        int asd;
        for (int i = 0; i < 1000000000; i++) {
            asd= (int) getAge.invoke(user);
        }
        endTime = System.currentTimeMillis();
        System.out.println("反射调用get"+(endTime-startTime));
    }
    private static void testReflectionWithAccessible() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class<? extends User> c1 = user.getClass();
        Method setAge = c1.getMethod("setAge", Integer.class);
        Method getAge = c1.getMethod("getAge", null);
        setAge.setAccessible(true);
        getAge.setAccessible(true);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            setAge.invoke(user,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射withAccessible调用set"+(endTime-startTime));
        startTime = System.currentTimeMillis();
        int asd;
        for (int i = 0; i < 1000000000; i++) {
            asd= (int) getAge.invoke(user);
        }
        endTime = System.currentTimeMillis();
        System.out.println("反射withAccessible调用调用"+(endTime-startTime));
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        testNormal();
        testReflection();
        testReflectionWithAccessible();

    }
}
