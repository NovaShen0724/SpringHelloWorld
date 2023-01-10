package top.novashen.demo2;

public class Client {
    public static void main(String[] args) {
        UserServiceProxy userService=new UserServiceProxy();
        userService.setUserService(new UserServiceImpl());
        userService.add();
    }
}
