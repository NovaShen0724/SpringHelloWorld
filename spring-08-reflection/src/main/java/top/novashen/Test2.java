package top.novashen;

public class Test2 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
    }
}
