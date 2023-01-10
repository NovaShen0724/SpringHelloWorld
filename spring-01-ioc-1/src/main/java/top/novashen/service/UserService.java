package top.novashen.service;

import top.novashen.dao.UserDao;

public interface UserService {
    void getUser();
    void setUserDao(UserDao userDao);
}
