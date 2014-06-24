package com.bjsxt.service;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.dao.impl.UserDAOImpl;
import com.bjsxt.model.User;

/**
 * Author: fs302
 * Date: 14-6-24
 * Time: ионГ11:19
 */
public class UserService {

    private UserDAO userDAO = new UserDAOImpl();

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void add(User u) {
        this.userDAO.save(u);
    }
}
