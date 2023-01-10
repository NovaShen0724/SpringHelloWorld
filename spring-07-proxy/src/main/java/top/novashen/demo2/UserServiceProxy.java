package top.novashen.demo2;

public class UserServiceProxy implements UserService{
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private void log(String msg){
        System.out.println("Use function "+msg);
    }
    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void del() {
        log("del");
        userService.del();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }
}
