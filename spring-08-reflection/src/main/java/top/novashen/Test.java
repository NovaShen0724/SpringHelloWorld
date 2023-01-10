package top.novashen;
//理解java虚拟机对于对象的创建的顺序
public class Test {
    private static Test instance;
    private static Test t2;
    static {
        System.out.println("static开始");
        // 下面这句编译器报错，非法向前引用
        // System.out.println("x=" + x);
        instance = new Test();
        t2=new Test();
        System.out.println("static结束");
    }

    public Test() {
        System.out.println("构造器开始");
        System.out.println("x=" + x + ";y=" + y);
        // 构造器可以访问声明于他们后面的静态变量
        // 因为静态变量在类加载的准备阶段就已经分配内存并初始化0值了
        // 此时 x=0，y=0
        x++;
        y++;
        System.out.println("x=" + x + ";y=" + y);
        System.out.println("构造器结束");
    }

    public static int x = 6;
    public static int y;

    public static Test getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Test obj = Test.getInstance();
        System.out.println("x=" + obj.x);
        System.out.println("y=" + obj.y);
    }
}