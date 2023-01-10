package top.novashen.service;

import top.novashen.dao.UserDao;
import top.novashen.dao.UserDaoImpl;
import top.novashen.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao=null;
    @Override
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
