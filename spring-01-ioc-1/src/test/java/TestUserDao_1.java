import top.novashen.dao.UserDaoImpl;
import top.novashen.dao.UserDaoMysqlImpl;
import top.novashen.service.UserService;
import top.novashen.service.UserServiceImpl;

public class TestUserDao_1 {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();
    }
}
